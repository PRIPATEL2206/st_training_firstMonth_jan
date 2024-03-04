package weatherStationData;

import java.util.Random;

class TemperatureSensor implements Sensor {
    @Override
    public WeatherData collectWeatherData() {
        // Simulate collecting temperature data
        double temperature = new Random().nextDouble() * 30.0; // Random temperature between 0 and 30 degrees Celsius
        return new WeatherData(temperature, 0, 0);
    }
}
