package weatherStationData;

import java.util.Random;

class WindSpeedSensor implements Sensor {
    @Override
    public WeatherData collectWeatherData() {
        // Simulate collecting wind speed data
        double windSpeed = new Random().nextDouble() * 40.0; // Random wind speed between 0 and 40 meters per second
        return new WeatherData(0, 0, windSpeed);
    }
}
