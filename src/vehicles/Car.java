package vehicles;

public class Car extends Vehicle{

    public Car (){}

    public Car(String name){
        super(name);
    }
    public void crashNoise() {
        super.makeNoise();
        System.out.println("Rrrrrrrrrt crash");
    }
}
