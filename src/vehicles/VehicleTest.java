package vehicles;

import java.util.Arrays;

public class VehicleTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.setName("Chevelle");
        car.makeNoise();
        car.crashNoise();

        Bicycle bike = new Bicycle();
        bike.setName("Schwinn");
        System.out.print(bike.getName() + " goes ");
        bike.makeNoise();
    }

}
