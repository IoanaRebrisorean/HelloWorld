package com.example.helloworld.inheritance;

public class Dog extends Animal {

    private String breed;

    public Dog() {
    }

    public Dog(String name, int age, String color, String breed) {
        super(name, age, color);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void bite() {
        System.out.println(getName() + " musca");
    }

    public void bite(int catDeTare) {
        System.out.println(getName() + " musca atat de tare: " + catDeTare);
    }

    @Override
    public void speak() {
        System.out.println(getName() + " latra");
    }

    @Override
    public void walk() {
        System.out.println(getName() + " alearga in cerc");
    }
}
