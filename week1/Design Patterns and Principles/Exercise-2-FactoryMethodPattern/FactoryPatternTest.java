public class FactoryPatternTest {
    public static void main(String[] args) {
        System.out.println("--- Factory Pattern Test ---");

        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.createVehicle();
        car.drive();

        VehicleFactory bikeFactory = new BikeFactory();
        Vehicle bike = bikeFactory.createVehicle();
        bike.drive();
    }
}
