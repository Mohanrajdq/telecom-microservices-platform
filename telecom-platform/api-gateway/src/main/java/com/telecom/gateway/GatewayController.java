package com.telecom.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GatewayController {

    private final RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/place-order")
    public String placeOrder() {
        return restTemplate.getForObject(
                "http://order-service/orders",
                String.class
        );
    }

    @GetMapping("/")
    public String gateway() {
        return "Telecom API Gateway Running";
    }
}
