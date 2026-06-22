public class PhoneDisplay implements WeatherObserver {
    @Override
    public void update(int temperature, int humidity) {
        System.out.println("Phone Display -> Temp: " + temperature + "C, Humidity: " + humidity + "%");
    }
}
