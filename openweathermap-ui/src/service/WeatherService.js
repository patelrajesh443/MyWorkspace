import axios from 'axios';

const BASE_URL = "http://localhost:8080/v1/weather/"
const auth = {
    username: 'ram', password: 'ram'
}

class WeatherService {

    getWeatherData(country) {
        return axios.get(BASE_URL + country, {auth})
    }
}

export default new WeatherService();