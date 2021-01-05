package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        Cat cat = new Cat("Feles", true);
        Dog dog = new Dog("Manka", false);
        animals.add(cat);
        animals.add(dog);
        Owner owner = new Owner(animals);
        owner.feed();

    }




}
