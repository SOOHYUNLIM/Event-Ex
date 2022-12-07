package com.example.ddd.auth;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class AuthRequest {
    private final String userName;
    private final String phoneNumber;
}
