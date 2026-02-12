package com.example.Spring2026.controller;

import com.example.Spring2026.service.ExternalApiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class DataController {

    private final ExternalApiService externalApiService;

    public DataController(ExternalApiService externalApiService) {
        this.externalApiService = externalApiService;
    }

    @GetMapping("/api/data")
    public Map<String, Object> getData() {
        return externalApiService.getExternalData();
    }
}
