package com.telecom.notification;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    @GetMapping("/notifications")
    public String notifications() {
        return "Notification Service Running";
    }
}
