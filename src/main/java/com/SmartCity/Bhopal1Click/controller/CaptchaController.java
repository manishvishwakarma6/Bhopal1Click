package com.SmartCity.Bhopal1Click.controller;

import org.springframework.web.bind.annotation.*;
import jakarta.servlet.http.HttpSession;
import org.springframework.http.ResponseEntity;
import java.util.Random;

@RestController
@RequestMapping("/api/captcha")
public class CaptchaController {

    @GetMapping("/generate")
    public ResponseEntity<String> generateCaptcha(HttpSession session) {
        String captcha = generateRandomCaptcha();
        session.setAttribute("captcha", captcha); // Store CAPTCHA in session
        return ResponseEntity.ok(captcha);
    }

    @PostMapping("/validate")
    public ResponseEntity<String> validateCaptcha(@RequestParam String inputCaptcha, HttpSession session) {
        String sessionCaptcha = (String) session.getAttribute("captcha");

        if (sessionCaptcha == null || !sessionCaptcha.equalsIgnoreCase(inputCaptcha)) {
            return ResponseEntity.badRequest().body("Invalid CAPTCHA. Please try again.");
        }

        return ResponseEntity.ok("CAPTCHA Verified Successfully!");
    }

    private String generateRandomCaptcha() {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder captcha = new StringBuilder();
        for (int i = 0; i < 6; i++) { // Generate a 6-character CAPTCHA
            captcha.append(chars.charAt(random.nextInt(chars.length())));
        }
        return captcha.toString();
    }
}
