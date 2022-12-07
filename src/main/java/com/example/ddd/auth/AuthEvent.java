package com.example.ddd.auth;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class AuthEvent {
    private final String userName;
    private final String phoneNumber;
}
