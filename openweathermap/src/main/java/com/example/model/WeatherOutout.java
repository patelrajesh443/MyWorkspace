package com.example.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class WeatherOutout {
    private final float low;
    private final float high;
    private final String message;
}
