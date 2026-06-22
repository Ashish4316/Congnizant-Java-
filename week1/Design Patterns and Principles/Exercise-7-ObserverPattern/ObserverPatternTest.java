public class ObserverPatternTest {
    public static void main(String[] args) {
        System.out.println("--- Observer Pattern Test ---");

        WeatherStation station = new WeatherStation();

        WeatherObserver phoneDisplay = new PhoneDisplay();
        WeatherObserver tvDisplay = new TvDisplay();

        station.registerObserver(phoneDisplay);
        station.registerObserver(tvDisplay);

        System.out.println("Setting weather data to 25C, 60%");
        station.setWeatherData(25, 60);

        System.out.println("\nRemoving TV Display and updating data to 30C, 50%");
        station.removeObserver(tvDisplay);
        station.setWeatherData(30, 50);
    }
}
