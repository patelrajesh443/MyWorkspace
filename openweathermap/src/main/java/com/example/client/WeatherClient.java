package com.example.client;

import com.example.model.WeatherInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "MyOpenWeatherMap", url = "${openweathermap.url}")
public interface WeatherClient {

    @GetMapping
    WeatherInfo getWeather(@RequestParam String q);
}
