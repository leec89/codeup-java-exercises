package vehicles;

public class Car extends Vehicle{

    public void crashNoise() {
        super.makeNoise();
        System.out.println("Rrrrrrrrrt crash");
    }
}
