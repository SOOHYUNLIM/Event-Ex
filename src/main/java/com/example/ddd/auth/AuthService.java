package com.example.ddd.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final ApplicationEventPublisher eventPublisher;

    public String getAuthenticationCode(AuthRequest request) {
        //인증을 한다.
        //이벤트를 등록한다.
        System.out.println("인증 서비스 처리 중.......");
        eventPublisher.publishEvent(new AuthEvent(request.getUserName(), request.getPhoneNumber()));
        return "123123";
    }
}
