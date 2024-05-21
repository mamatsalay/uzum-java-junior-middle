package org.uzum.iggytoto.java_classes;

public class Car {

    private int serialNumber;
    private Engine engine;

    public Car(int serialNumber, Engine engine) {
        this.serialNumber = serialNumber;
        this.engine = engine;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "serialNumber=" + serialNumber +
                ", engineSizeOfPedals=" + engine.getSizeOfPedals() +
                '}';
    }

}
