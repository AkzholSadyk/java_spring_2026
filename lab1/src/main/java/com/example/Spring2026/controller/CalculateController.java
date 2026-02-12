package com.example.Spring2026.controller;

import com.example.Spring2026.dto.CalculateRequest;
import com.example.Spring2026.service.CalculationService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class CalculateController {

    private final CalculationService calculationService;

    public CalculateController(CalculationService calculationService) {
        this.calculationService = calculationService;
    }

    @PostMapping("/api/calculate")
    public Map<String, Integer> calculate(@RequestBody CalculateRequest request) {
        int result = calculationService.add(request.getA(), request.getB());
        return Map.of("result", result);
    }
}
