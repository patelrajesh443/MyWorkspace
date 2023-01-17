package com.example.service.imp;

import com.example.client.WeatherClient;
import com.example.model.WeatherInfo;
import com.example.model.WeatherOutout;
import com.example.service.WeatherService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class WeatherServiceImpTest {

    @InjectMocks
    private WeatherServiceImp weatherService;
    @Mock
    private WeatherClient weatherClient;

    @Mock
    private WeatherInfo weatherInfo;

    @Test
    void getWeather() {
        Mockito.when(weatherClient.getWeather(Mockito.anyString())).thenReturn(weatherInfo);
        Mockito.when(weatherInfo.getList()).thenReturn(Mockito.anyList());
        List<WeatherOutout> london = weatherService.getWeather("london");
        assertEquals(london.size(), london.size());
    }
}