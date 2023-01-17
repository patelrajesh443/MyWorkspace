import axios from 'axios';

const BASE_URL = "http://localhost:8080/openweathermap/v1/weather/"

class WeatherService {
    getWeatherData(country) {
        return axios.get(BASE_URL + country)
    }
}

export default new WeatherService();