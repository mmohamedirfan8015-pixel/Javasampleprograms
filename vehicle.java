class Vehicle {
    String brand = "Toyota";

    void start() {
        System.out.println("Vehicle is starting...");
    }
}


class Car extends Vehicle {
    String model = "Corolla";

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

// Main class
public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Car car = new Car();

        car.start();     
        car.display();    
    }
}
