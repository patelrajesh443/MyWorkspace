package com.example.service.imp;

import com.example.client.WeatherClient;
import com.example.constant.WeatherConstants;
import com.example.model.Main;
import com.example.model.WeatherInfo;
import com.example.model.WeatherOutout;
import com.example.service.WeatherService;
import com.example.utils.WeatherUtil;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class WeatherServiceImp implements WeatherService {
    private final WeatherClient weatherClient;

    @Override
    public List<WeatherOutout> getWeather(String country) {
        final List<WeatherOutout> weatherOutouts = new ArrayList<>();
        final WeatherInfo weather = weatherClient.getWeather(country);
        log.info("weather info {} ", weather);
        weather.getList().stream().limit(3).forEach(weatherList -> {
            final Main main = weatherList.getMain();
            final float low = main.getTemp_min();
            final float high = main.getTemp_max();
            float temperatureInCelsius = main.getTemp();
            final StringBuilder message = new StringBuilder();
            if (temperatureInCelsius > 40.0) {
                message.append(WeatherConstants.USE_SUNSCREEN_LOTION);
            }
            weatherList.getWeather().stream().limit(1).forEach(weatherDetail -> {
                if (weatherDetail.getMain().equalsIgnoreCase(WeatherConstants.RAIN)) {
                    message.append(" " + WeatherConstants.CARRY_UMBRELLA);
                }
            });
            weatherList.getWeather().stream().limit(1).forEach(weatherDetail -> {
                message.append(" " + weatherDetail.getDescription());
            });

            weatherOutouts.add(WeatherOutout.builder().low(low).high(high).message(message.toString()).build());
        });
        return weatherOutouts;
    }
}
