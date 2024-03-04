package weatherStationData;

import java.util.ArrayList;
import java.util.List;

class WeatherStation {
    private List<Sensor> sensors;

    public WeatherStation() {
        this.sensors = new ArrayList<>();
    }

    public void addSensor(Sensor sensor) {
        sensors.add(sensor);
    }

    public WeatherData getCurrentWeather() {
        double totalTemperature = 0.0;
        double totalHumidity = 0.0;
        double totalWindSpeed = 0.0;

        for (Sensor sensor : sensors) {
            WeatherData weatherData = sensor.collectWeatherData();
            totalTemperature += weatherData.getTemperature();
            totalHumidity += weatherData.getHumidity();
            totalWindSpeed += weatherData.getWindSpeed();
        }

        int numSensors = sensors.size();
        double averageTemperature = totalTemperature / numSensors;
        double averageHumidity = totalHumidity / numSensors;
        double averageWindSpeed = totalWindSpeed / numSensors;

        return new WeatherData(averageTemperature, averageHumidity, averageWindSpeed);
    }

    public void provideWeatherForecast() {
        WeatherData currentWeather = getCurrentWeather();

        System.out.println("\nWeather Forecast:");
        System.out.println("Temperature: " + currentWeather.getTemperature() + " °C");
        System.out.println("Humidity: " + currentWeather.getHumidity() + " %");
        System.out.println("Wind Speed: " + currentWeather.getWindSpeed() + " m/s");
    }
}
