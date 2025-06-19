package Constructors;

public class Car {
    private String car_brand;
    private String car_model;
    private int car_price;
    Car(String car_brand, String car_model, int car_price){
        this.car_brand = car_brand;
        this.car_model = car_model;
        this.car_price = car_price;

    }
    void display(){
        System.out.println("Car brand is " + car_brand);
        System.out.println("Car model is " + car_model);
        System.out.println("Car price is " + car_price);

    }

    public static void main(String[] args) {
        Car c2 = new Car("TATA", "Punch", 10000);
        c2.display();

    }
}
