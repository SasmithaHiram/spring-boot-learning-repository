package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.service.JWTService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HomeController {
    private final JWTService jwtService;

    public String message() {
        return "Hello";
    }

    @PostMapping("/login")
    public String login() {
        return jwtService.getJWTToken();
    }

    @GetMapping("/username")
    public String getUsername (@RequestParam String token) {
        return jwtService.getUserName(token);
    }
}
