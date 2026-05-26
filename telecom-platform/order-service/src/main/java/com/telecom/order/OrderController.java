package com.telecom.order;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {

    private final RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/orders")
    public String orders() {

        String inventory =
                restTemplate.getForObject(
                        "http://inventory-service/inventory",
                        String.class);

        String payment =
                restTemplate.getForObject(
                        "http://payment-service/payments",
                        String.class);

        String notification =
                restTemplate.getForObject(
                        "http://notification-service/notifications",
                        String.class);

        return "Order Created | "
                + inventory + " | "
                + payment + " | "
                + notification;
    }
}
