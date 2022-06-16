package vehicles;

public class MyGarage {

    public static void main(String[] args) {
        Garage myGarage = new Garage("Chris's Garage");

        Vehicle[] garageVehicles = new Vehicle[3];

        garageVehicles[0] = new Car("Rav4");
        garageVehicles[1] = new Car("Leaf");
        garageVehicles[2] = new Car("Jetta");
        myGarage.setVehicles(garageVehicles);
        myGarage.retrieveVehicles();
    }
}
