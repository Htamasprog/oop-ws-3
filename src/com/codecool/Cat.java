package com.codecool;

public class Cat extends Animal{

    public Cat(String name, Boolean isMale) {
        super(name, isMale);
    }

    @Override
    protected void speak() {
        System.out.println("Meow");

    }
}
