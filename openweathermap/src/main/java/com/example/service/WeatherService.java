package com.example.service;

import com.example.model.WeatherOutout;

import java.util.List;

public interface WeatherService {
    List<WeatherOutout> getWeather(String country);
}
