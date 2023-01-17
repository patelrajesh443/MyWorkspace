package com.example.model;

import lombok.*;
import lombok.extern.jackson.Jacksonized;

import java.util.ArrayList;
import java.util.List;

@Jacksonized
@Data
public class WeatherInfo {
    private final List<WeatherList> list = new ArrayList<>();
}
