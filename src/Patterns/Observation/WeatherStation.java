package Patterns.Observation;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        currentDisplay.display();
        weatherData.setMeasurements(80, 70, 29.2f);
        currentDisplay.display();
        weatherData.removeObserver(currentDisplay);
        weatherData.setMeasurements(81, 71, 30f);
        currentDisplay.display();
        weatherData.registerObserver(currentDisplay);
        weatherData.setMeasurements(82, 72, 30f);
        System.out.println("----------");
       // currentDisplay.display();
    }

}
