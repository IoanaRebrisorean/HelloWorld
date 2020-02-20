package com.example.helloworld;

import java.awt.print.Pageable;

public class Homework2 {

    private static void assignment1() {
        System.out.println("Hello World!");
        System.out.println("Ioana-Iuliana Rebrisorean");
    }

    private static void assignment2() {
        System.out.println("The addition of 7 and 8 is: " + (7 + 8));
    }

    private static void assignment3() {
        System.out.println(6f / 4f);
    }

    private static void assignment4() {
        int a = -6 + 8 * 6;
        int b = (55 + 9) % 9;
        float c = 20 + -3f * 5f / 8f;
        float d = 5 + 15f / 3f * 2 -8 % 3;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }

    public static void printAll() {
        assignment1();
        assignment2();
        assignment3();
        assignment4();
    }
}
