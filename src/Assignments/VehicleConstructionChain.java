package Assignments;
public class VehicleConstructionChain{
    public static void main(String[] args) {
        Bike b = new Bike();
    }

}

class Vehicle {
    Vehicle(){
        System.out.println("Vehicle is Ready");
    }
}
class Bike extends Vehicle{
    Bike(){
        System.out.println("Bike is Ready");
    }
}

