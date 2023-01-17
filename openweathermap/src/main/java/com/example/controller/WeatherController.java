package com.example.controller;

import com.example.service.WeatherService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@AllArgsConstructor
@RequestMapping("v1")
@Slf4j
public class WeatherController {
    private final WeatherService weatherService;

    @GetMapping("weather/{country}")
    public ResponseEntity getWeather(@PathVariable @NonNull String country) {
        log.info("Got weather request for country {} ", country);
        if (country == null || country.isBlank()) {
            return ResponseEntity.badRequest().body("Country should not be null or blank");
        }
        return ResponseEntity.ok(weatherService.getWeather(country));
    }
}
