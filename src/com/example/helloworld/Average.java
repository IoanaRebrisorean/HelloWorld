package com.example.helloworld;

import java.util.Scanner;

public class Average {

    private int n1;
    private int n2;
    private int n3;

    private void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nr 1 = ");
        n1 = scanner.nextInt();
        System.out.println("Nr 2 = ");
        n2 = scanner.nextInt();
        System.out.println("Nr 3 = ");
        n3 = scanner.nextInt();
    }

    private float average(int a1, int a2, int a3) {
        float result = (float) (a1 + a2 + a3) / 3f;
        return result;
    }

    private void printAverage(float average) {
        System.out.println("Media = " + average);
    }

    public void solve() {
        read();
        float media = average(n1, n2, n3);
        printAverage(media);
    }
}
