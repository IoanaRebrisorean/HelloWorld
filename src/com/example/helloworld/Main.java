package com.example.helloworld;

import com.example.helloworld.inheritance.Bichon;
import com.example.helloworld.inheritance.Dog;

public class Main {

    public static void main(String[] args) {
        // homework1();

        // homework 2 - encapsulate all the operations from homework 1
        //Homework2.printAll();

        // homework 3
        //ReadNumbers readNumbers = new ReadNumbers();
        //readNumbers.solve();

        // homework 4
//        Average average = new Average();
//        average.solve();

        // homework 5
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input first number: ");
//        float n1 = scanner.nextFloat();
//        System.out.println("Input second number: ");
//        float n2 = scanner.nextFloat();
//        Operations operations = new Operations(n1, n2);
//        operations.solve();

        // homework 6
//        IfElse.printString();
//        IfElse.printNumber();
//        IfElse.switchNumber();

        // homework 7 - for loops
//        Loops.printNumbers();
//        Loops.printBackwards();
//        Loops.printStars();
//        Loops.sumAndAverageDoWhile();
//        Loops.sumAndAverageRange();
//        Loops.sumOddNumbers();
//        Loops.fibonacci();
//        Loops.cozzaLozzaWozza();

        // homework 8 - inheritance
        Dog dog1 = new Dog();
        dog1.setBreed("ciban");
        dog1.setAge(4);
        dog1.setColor("maro");
        dog1.setName("vosi");

        Dog dog2 = new Dog("ilinca", 1, "alba", "pitbull");
        dog2.speak();
        dog2.walk();
        dog2.bite();
        dog2.bite(6);

        Bichon dog3 = new Bichon("Freya", 2, "Alb murdar", "aproape bichon");
        dog3.bite();
        dog3.printAge();
        System.out.println(dog3.getInfo());
    }

    private static void homework1() {
        // Assignment #1
        System.out.println("Hello World!");
        System.out.println("Ioana-Iuliana Rebrisorean");

        // Assignment #2 - v1
        int nr1 = 7, nr2 = 8;
        int suma = nr1 + nr2;
        System.out.println("The addition of 7 and 8 is: " + suma);

        // Assignment #2 - v2
        System.out.println("The addition of 7 and 8 is: " + (7 + 8));

        // Assingment #3
        // Specifica tipul de date explicit altfel compilatorul trateaza numerele ca fiind intregi. Ex: 5f pentru un float cu valoarea 5
        System.out.println(6f / 4f);

        // Assignment #4
        int a = -6 + 8 * 6;
        int b = (55 + 9) % 9;
        float c = 20 + -3f * 5f / 8f;
        float d = 5 + 15f / 3f * 2 -8 % 3;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
