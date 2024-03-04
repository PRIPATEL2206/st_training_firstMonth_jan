package weatherStationData;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherMonitoringSystem {
    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();

        weatherStation.addSensor(new TemperatureSensor());
        weatherStation.addSensor(new HumiditySensor());
        weatherStation.addSensor(new WindSpeedSensor());

        weatherStation.provideWeatherForecast();
    }
}

