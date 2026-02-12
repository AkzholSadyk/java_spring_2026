package com.example.Spring2026.repositry;

import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Repository
public class ExternalApiRepository {

    private static final String API_URL = "https://api.chucknorris.io/jokes/random";

    private final RestTemplate restTemplate;

    public ExternalApiRepository(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Map<String, Object> fetchRandomJoke() {
        return restTemplate.getForObject(API_URL, Map.class);
    }
}
