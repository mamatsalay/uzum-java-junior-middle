package org.uzum.iggytoto.java_classes;


import java.util.ArrayList;
import java.util.List;
public class FactoryAF {
    private List<Customer> customers;
    private List<Car> cars;

    public FactoryAF() {
        customers = new ArrayList<>();
        cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void saleCar() {
        for (Customer customer : customers) {
            if (!cars.isEmpty()) {
                customer.setCar(cars.remove(0));
            }
        }

        if (!cars.isEmpty()) {
            cars.clear();
        }
    }

    public void displayCars() {
        System.out.println("Cars in the factory:");
        if(!cars.isEmpty()) {
            cars.forEach(System.out::println);
        } else {
            System.out.println("No cars available in the factory");
        }
    }

    public void displayCustomers() {
        System.out.println("Customers:");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
