package wetherSystem;

import java.util.ArrayList;
import java.util.List;

class WeatherStation {
    private String name;
    private List<WeatherData> weatherDataList;

    public WeatherStation(String name) {
        this.name = name;
        this.weatherDataList = new ArrayList<>();
    }

    public void collectWeatherData(double temperature, double humidity, double windSpeed) {
        WeatherData weatherData = new WeatherData(temperature, humidity, windSpeed);
        weatherDataList.add(weatherData);
        System.out.println(name + " collected weather data: " + weatherData);
    }

    public List<WeatherData> getWeatherDataList() {
        return weatherDataList;
    }
}
