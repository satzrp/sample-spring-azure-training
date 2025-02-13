package com.azuretraining.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
class HomeController {

    @GetMapping
    public String home() {
        return "Hello from Spring Application";
    }
}
