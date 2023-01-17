package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

import java.util.ArrayList;
import java.util.List;

@Jacksonized //missing
@Builder
@Data
public class WeatherList {

    private final Main main;

    private final List<WeatherDetail> weather;
}
