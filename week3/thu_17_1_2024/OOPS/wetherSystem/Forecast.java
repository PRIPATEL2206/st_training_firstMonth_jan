package wetherSystem;

import java.util.List;

class Forecast {
    public static WeatherData generateAverageForecast(List<WeatherData> weatherDataList) {
        if (weatherDataList.isEmpty()) {
            return null;
        }

        double avgTemperature = 0;
        double avgHumidity = 0;
        double avgWindSpeed = 0;

        for (WeatherData weatherData : weatherDataList) {
            avgTemperature += weatherData.getTemperature();
            avgHumidity += weatherData.getHumidity();
            avgWindSpeed += weatherData.getWindSpeed();
        }

        int dataSize = weatherDataList.size();
        avgTemperature /= dataSize;
        avgHumidity /= dataSize;
        avgWindSpeed /= dataSize;

        return new WeatherData(avgTemperature, avgHumidity, avgWindSpeed);
    }
}
