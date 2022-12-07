package com.example.ddd.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthController {
    private final AuthService service;

    @GetMapping("/auth")
    public String auth(AuthRequest request) {
        System.out.println("Controller 요청 받음...: " + request.getUserName() + " / " + request.getPhoneNumber());
        return service.getAuthenticationCode(request);
    }
}
