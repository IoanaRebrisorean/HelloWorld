package com.example.helloworld.inheritance;

public class Animal {

    private String name;
    private int age;
    private String color;

    public Animal() {
    }

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void walk() {
        System.out.println(name + " walks");
    }

    public void speak() {
        System.out.println(name + " speaks");
    }

    public void printAge() {
        System.out.println(name + " are " + age + " ani");
    }

    public String getInfo() {
        return name + " are " + age + " ani!!!";
    }
}
