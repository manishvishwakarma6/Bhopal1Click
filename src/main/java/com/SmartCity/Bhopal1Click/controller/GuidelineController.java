package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.service.GuidelineService;

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
@RequestMapping("/guideline")

public class GuidelineController {
	 private final GuidelineService guidelineService;

	    public GuidelineController(GuidelineService guidelineService) {
	        this.guidelineService = guidelineService;
	    }

	    // Show upload form
	    @GetMapping
	    public String showUploadForm(Model model) {
	        try {
	            List<String> files = guidelineService.listAllFiles();
	            model.addAttribute("files", files);
	        } catch (IOException e) {
	            model.addAttribute("error", "Could not load file list.");
	        }
	        return "guidelineupload";
	    }

	    // Upload PDF
	    @PostMapping("/guidelineupload")
	    public String uploadFile(@RequestParam("file") MultipartFile file, Model model) {
	        try {
	            String fileName = guidelineService.storeFile(file);
	            model.addAttribute("message", "File uploaded successfully: " + fileName);
	        } catch (IOException e) {
	            model.addAttribute("error", "File upload failed: " + e.getMessage());
	        }
	        return "redirect:/guideline";
	    }

	    // Download PDF
	    @GetMapping("/download/{fileName}")
	    public ResponseEntity<Resource> downloadFile(@PathVariable String fileName) {
	        try {
	            Resource resource = guidelineService.loadFileAsResource(fileName);

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
	        boolean deleted = guidelineService.deleteFile(fileName);
	        if (deleted) {
	            model.addAttribute("message", "File deleted successfully: " + fileName);
	        } else {
	            model.addAttribute("error", "File deletion failed: " + fileName);
	        }
	        return "redirect:/guideline";
	    }

	   

	    
	}
