package wetherSystem;

import java.util.List;

public class WeatherSystem {
    public static void main(String[] args) {
        // Create weather stations
        WeatherStation station1 = new WeatherStation("Station 1");
        WeatherStation station2 = new WeatherStation("Station 2");

        // Collect weather data
        station1.collectWeatherData(25.5, 65.0, 3.5);
        station1.collectWeatherData(26.0, 68.0, 4.0);
        station1.collectWeatherData(24.5, 62.0, 3.2);

        station2.collectWeatherData(22.0, 60.0, 2.8);
        station2.collectWeatherData(23.5, 63.0, 3.0);
        station2.collectWeatherData(21.0, 58.0, 2.5);

        // Generate forecasts
        List<WeatherData> station1Data = station1.getWeatherDataList();
        List<WeatherData> station2Data = station2.getWeatherDataList();

        WeatherData averageForecast1 = Forecast.generateAverageForecast(station1Data);
        WeatherData averageForecast2 = Forecast.generateAverageForecast(station2Data);

        // Display forecasts
        System.out.println("\nAverage Forecast for Station 1: " + averageForecast1);
        System.out.println("Average Forecast for Station 2: " + averageForecast2);
    }
}

