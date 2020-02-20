package com.example.helloworld;

import java.util.Random;
import java.util.Scanner;

public class Loops {

    public static void printNumbers() {
        Scanner scanner = new Scanner(System.in); // folosit pentru a citi de la tastatura
        System.out.println("Dati n = ");
        int n = scanner.nextInt(); // citim un numar intreg
        for (int i = n; i <= 100; i++) { // pentru fiecare numar incepand de la n pana la 100, afiseaza-l
            System.out.println(i);
        }
    }

    public static void printBackwards() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dati primul nr = ");
        int a = scanner.nextInt();
        System.out.println("Dati al doilea nr = ");
        int b = scanner.nextInt();

        // determina max si min
        int min, max;
        if (a > b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }

        for (int i = max; i >= min; i--) { // afieseaza fiecare numar incepand de la maxim pana la minim
            System.out.println(i);
        }
    }

    public static void printStars() {
        for (int i = 7; i > 0; i--) { // bucla care parcurge liniile
            String linie = ""; // la inceput linia este goala
            for (int j = i; j > 0; j--) { // se adauga i stelute pe o linie (i -> [7, 1])
                linie += "*";
            }
            System.out.println(linie); // se afiseaza linia
        }
    }

    public static void sumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dati n = ");
        int n = scanner.nextInt();
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma = suma + i;
        }

        float media = (float) suma / (float) n;

        System.out.println("Suma este = " + suma);
        System.out.println("Media este = " + media);
    }

    public static void sumAndAverageWhile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dati n = ");
        int n = scanner.nextInt();
        int suma = 0;

        int i = 1;
        while (i <= n) {
            suma = suma + i;

            i++;
        }

        float media = (float) suma / (float) n;

        System.out.println("Suma este = " + suma);
        System.out.println("Media este = " + media);
    }

    public static void sumAndAverageDoWhile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dati n = ");
        int n = scanner.nextInt();
        int suma = 0;

        int i = 1;
        do {
            suma = suma + i;

            i++;
        } while (i <= n);

        float media = (float) suma / (float) n;

        System.out.println("Suma este = " + suma);
        System.out.println("Media este = " + media);
    }

    public static void sumAndAverageRange() {
        float suma = 0;
        int n = 0;

        int i = 111;
        while (i <= 8899) {
            suma = suma + i;
            n++;

            i++;
        }

        float media = suma / n;

        System.out.println("Count = " + n);
        System.out.println("Suma este = " + suma);
        System.out.println("Media este = " + media);
    }

    public static void sumOddNumbers() {
        float suma = 0;
        float media = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) { // numar impar
                suma += i;
            }
        }

        System.out.println("suma nr impare = " + suma);
        System.out.println("media = " + (suma / 100));
    }

    public static void fibonacci() {
        int a = 0; // ante penultimnul numar
        int b = 1; // penultimul numar
        System.out.println(a);
        System.out.println(b);
        for (int i = 1; i <= 18; i++) {
            int numar = a + b;
            System.out.println(numar);
            a = b;
            b = numar;
        }
    }

    public static void cozzaLozzaWozza() {
        String linie = "";
        for (int i = 1; i <= 110; i++) {
            //i in rest construim linia la lfiecare pas adaugand nr curent
            String nume = "";
            if (i % 3 == 0) {
                nume += "Cozza";
            }
            if (i % 5 == 0) {
                nume += "Lozza";
            }
            if (i % 7 == 0) {
                nume += "Wozza";
            }

            if (nume.equals("")) {
                linie += i + " ";
            } else {
                linie += nume + " ";
            }

            if (i % 11 == 0) {
                // daca ordinea nr este divizibila cu 11, afisam linia si o curatam
                System.out.println(linie);
                linie = "";
            }
        }
    }
}
