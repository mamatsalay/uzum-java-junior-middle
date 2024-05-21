package org.uzum.iggytoto.java_classes;

public class Customer {

    private String name;
    private Car car;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", car=" + (car != null ? car.getSerialNumber() : "No car") +
                '}';
    }

}
