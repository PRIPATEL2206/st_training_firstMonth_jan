package wetherSystem;

class WeatherData {
    private double temperature;
    private double humidity;
    private double windSpeed;

    public WeatherData(double temperature, double humidity, double windSpeed) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    @Override
    public String toString() {
        return "Temperature: " + temperature + "°C, Humidity: " + humidity + "%, Wind Speed: " + windSpeed + " m/s";
    }
}
