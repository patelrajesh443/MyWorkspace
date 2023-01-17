package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Jacksonized
@Builder
@Data
@AllArgsConstructor
public class WeatherDetail {

    private final float id;

    private final String main;

    private final String description;

    private final String icon;
}
