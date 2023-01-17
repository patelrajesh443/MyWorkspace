import React, {useEffect, useState} from "react";
import {WeatherData} from "./WeatherData";
import WeatherService from "../service/WeatherService";


export const Home = () => {
    const [weather, setWeather] = useState([]);
    const [country, setCountry] = useState('');
    const [inputCountry, setInputCountry] = useState('');
    useEffect(() => {
        WeatherService.getWeatherData("London").then((response) => {
            setCountry("London");
            setWeather(response.data);
        });
    }, [])

    const getWeather = event => {
        event.preventDefault();
        WeatherService.getWeatherData(inputCountry).then((response) => {
            setCountry(inputCountry);
            setWeather(response.data);
        });
        console.log('get weather data');
    };
    return (
        <>
            <h1>Welcome to OpenWeatherAPI</h1>
            <div>
                <form onSubmit={getWeather}>
                    <input
                        type="text"
                        id="inputCountry"
                        name="inputCountry"
                        value={inputCountry}
                        onChange={event => setInputCountry(event.target.value)}
                    />

                    <button type="submit">Submit</button>
                </form>
            </div>
            <WeatherData weatherData={weather} country={country}></WeatherData>
        </>
    );
}