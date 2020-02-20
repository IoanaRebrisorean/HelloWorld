package com.example.helloworld;

import java.util.Scanner;

public class IfElse {

    public static void printString() {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        if (s1.equals("FastTrack")) {
            System.out.println("a");
        } else {
            System.out.println("b");
        }
    }

    public static void printNumber() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x >= 2 && x <= 8) {
            System.out.println("Nr este = " + x);
        }
    }

    public static void switchNumber() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        switch (x) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println("number is = " + x);
                break;
            default:
                System.out.println("Not allowed");
        }
    }
}
