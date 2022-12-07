package com.example.ddd.detection;

import com.example.ddd.auth.AuthEvent;
import com.example.ddd.email.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DetectionService {
    private final EmailService service;

    @EventListener
    public void detectAuth(AuthEvent event) {
        //event로 이상감지하고 이메일을 보낸다.
        System.out.println("이상 탐지 진행중... " + event.getUserName() + " / " + event.getPhoneNumber());
        if("112".equals(event.getPhoneNumber())) {
            //메일발송
        }
    }
}
