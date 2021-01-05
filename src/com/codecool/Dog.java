package com.codecool;

public class Dog extends Animal{

    public Dog(String name, Boolean isMale) {
        super(name, isMale);
    }

    @Override
    protected void speak() {
        System.out.println("Wuff");

    }
}
