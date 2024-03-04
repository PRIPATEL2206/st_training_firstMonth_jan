package weatherStationData;

import java.util.Random;

class HumiditySensor implements Sensor {
    @Override
    public WeatherData collectWeatherData() {
        // Simulate collecting humidity data
        double humidity = new Random().nextDouble() * 100.0; // Random humidity percentage between 0 and 100
        return new WeatherData(0, humidity, 0);
    }
}
