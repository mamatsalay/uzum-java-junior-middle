package org.uzum.iggytoto.java_classes;

public class Main {

    public static void main(String[] args) {
        FactoryAF factory = new FactoryAF();

        // Adding cars
        factory.addCar(new Car(1, new Engine(3)));
        factory.addCar(new Car(2, new Engine(2)));
        factory.addCar(new Car(3, new Engine(3)));

        // Adding customers
        factory.addCustomer(new Customer("Алексей"));
        factory.addCustomer(new Customer("Евгений"));
        factory.addCustomer(new Customer("Владимир"));

        // Display cars and customers before sale
        factory.displayCars();
        factory.displayCustomers();

        // Selling cars
        factory.saleCar();

        // Display cars and customers after sale
        factory.displayCars();
        factory.displayCustomers();
    }

}
