package com.example.Spring2026.service;

import com.example.Spring2026.repositry.ExternalApiRepository;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ExternalApiService {

    private final ExternalApiRepository externalApiRepository;

    public ExternalApiService(ExternalApiRepository externalApiRepository) {
        this.externalApiRepository = externalApiRepository;
    }

    public Map<String, Object> getExternalData() {
        Map<String, Object> response = externalApiRepository.fetchRandomJoke();
        Object value = response != null ? response.get("value") : null;
        return Map.of(
                "source", "external-api",
                "value", value
        );
    }
}
