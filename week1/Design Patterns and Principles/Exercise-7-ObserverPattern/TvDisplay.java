public class TvDisplay implements WeatherObserver {
    @Override
    public void update(int temperature, int humidity) {
        System.out.println("TV Display -> Temperature is " + temperature + " degrees, Humidity is " + humidity + " percent.");
    }
}
