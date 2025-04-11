package com.SmartCity.Bhopal1Click.service;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class GuidelineService {
    
	 private static final String UPLOAD_DIR = "E:/guidelineuploads/";
	 
	    public GuidelineService() {
	        File uploadDir = new File(UPLOAD_DIR);
	        if (!uploadDir.exists()) {
	            uploadDir.mkdirs();
	        }
	    }

	    // Save file
	    public String storeFile(MultipartFile file) throws IOException {
	        if (!file.getContentType().equals("application/pdf")) {
	            throw new IOException("Only PDF files are allowed!");
	        }

	        Path filePath = Paths.get(UPLOAD_DIR + file.getOriginalFilename());
	        file.transferTo(filePath);
	        return file.getOriginalFilename();
	    }

	    // Get file as a resource
	    public Resource loadFileAsResource(String fileName) throws MalformedURLException {
	        Path filePath = Paths.get(UPLOAD_DIR).resolve(fileName).normalize();
	        return new UrlResource(filePath.toUri());
	    }

	    // List all stored PDF files
	    public List<String> listAllFiles() throws IOException {
	        try (Stream<Path> paths = Files.walk(Paths.get(UPLOAD_DIR))) {
	            return paths.filter(Files::isRegularFile)
	                        .map(Path::getFileName)
	                        .map(Path::toString)
	                        .collect(Collectors.toList());
	        }
	    }
	    
	    
	 // Delete file
	    public boolean deleteFile(String fileName) {
	        Path filePath = Paths.get(UPLOAD_DIR + fileName);
	        try {
	            return Files.deleteIfExists(filePath);
	        } catch (IOException e) {
	            return false;
	        }
	    }

	    
	    
	}
