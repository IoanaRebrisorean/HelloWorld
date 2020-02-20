package com.example.helloworld.inheritance;

public class Bichon extends Dog {

    public Bichon() {
    }

    public Bichon(String name, int age, String color, String breed) {
        super(name, age, color, breed);
    }

    @Override
    public void bite() {
        System.out.println(getName() + " nu prea musca tare");
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " si e curioasa!";
    }
}
