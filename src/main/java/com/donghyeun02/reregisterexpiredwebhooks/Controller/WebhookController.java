package com.donghyeun02.reregisterexpiredwebhooks.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebhookController {
    @RequestMapping("/test")
    public String test() {
        return "Hello";
    }
}
