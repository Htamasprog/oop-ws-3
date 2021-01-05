package com.codecool;

public abstract class Animal {
    private String name;
    private Boolean isMale;

    public Animal(String name, Boolean isMale) {
        this.name = name;
        this.isMale = isMale;
    }

    public String getName() {
        return name;
    }

    public Boolean getMale() {
        return isMale;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMale(Boolean male) {
        isMale = male;
    }

    public void feed() {
        System.out.println("niam niam");
        speak();
    }

    protected abstract void speak();




}
