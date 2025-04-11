package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.service.FileStorageService;

import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

@Controller
@RequestMapping("/pdf")
public class FileController {
	 private final FileStorageService fileStorageService;

	    public FileController(FileStorageService fileStorageService) {
	        this.fileStorageService = fileStorageService;
	    }

	    // Show upload form
	    @GetMapping
	    public String showUploadForm(Model model) {
	        try {
	            List<String> files = fileStorageService.listAllFiles();
	            model.addAttribute("files", files);
	        } catch (IOException e) {
	            model.addAttribute("error", "Could not load file list.");
	        }
	        return "fileupload";
	    }

	    // Upload PDF
	    @PostMapping("/fileupload")
	    public String uploadFile(@RequestParam("file") MultipartFile file, Model model) {
	        try {
	            String fileName = fileStorageService.storeFile(file);
	            model.addAttribute("message", "File uploaded successfully: " + fileName);
	        } catch (IOException e) {
	            model.addAttribute("error", "File upload failed: " + e.getMessage());
	        }
	        return "redirect:/pdf";
	    }

	    // Download PDF
	    @GetMapping("/download/{fileName}")
	    public ResponseEntity<Resource> downloadFile(@PathVariable String fileName) {
	        try {
	            Resource resource = fileStorageService.loadFileAsResource(fileName);

	            return ResponseEntity.ok()
	                    .contentType(MediaType.APPLICATION_PDF)
	                    .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + fileName + "\"")
	                    .body(resource);
	        } catch (MalformedURLException e) {
	            return ResponseEntity.notFound().build();
	        }
	    }
	    
	 // Delete PDF
	    @PostMapping("/delete/{fileName}")
	    public String deleteFile(@PathVariable String fileName, Model model) {
	        boolean deleted = fileStorageService.deleteFile(fileName);
	        if (deleted) {
	            model.addAttribute("message", "File deleted successfully: " + fileName);
	        } else {
	            model.addAttribute("error", "File deletion failed: " + fileName);
	        }
	        return "redirect:/pdf";
	    }

	   

	    
	}
