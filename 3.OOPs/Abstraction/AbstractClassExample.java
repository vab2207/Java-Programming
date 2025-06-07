abstract class Vehicle {
    abstract void start();

    void fuel() {
        System.out.println("Fuel type: Petrol or Diesel");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with key");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Vehicle obj = new Car();
        obj.start();
        obj.fuel();
    }
}
