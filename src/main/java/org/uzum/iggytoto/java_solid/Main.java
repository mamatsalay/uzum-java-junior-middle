package org.uzum.iggytoto.java_solid;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Барсик"));
        animals.add(new Cat("Мурзик"));

        animalSounds(animals);

    }

    public static void animalSounds(List <Animal> animals){

        animals.forEach(animal -> {
            System.out.println(animal.getName() + " говорит: ");
            animal.makeSound();
        });

    }
}
