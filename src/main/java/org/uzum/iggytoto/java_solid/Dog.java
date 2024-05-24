package org.uzum.iggytoto.java_solid;

public class Dog implements Animal{
    private String name;

    public Dog(String name){
        this.name = name;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void makeSound() {
        System.out.println("Гаф");
    }
}
