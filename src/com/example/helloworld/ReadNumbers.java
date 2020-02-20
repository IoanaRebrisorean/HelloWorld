package com.example.helloworld;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadNumbers {

    private int n1;
    private int n2;

    private void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nr 1 = ");
        n1 = scanner.nextInt();
        System.out.println("Nr 2 = ");
        n2 = scanner.nextInt();
    }

    private float multiply(int a1, int a2) {
        return a1 * a2;
    }

    private float multiply() {
        return n1 * n2;
    }

    private void printProduct(float product) {
        System.out.println("Produs = " + product);
    }

    public void solve() {
        read();
        float product = multiply();
        printProduct(product);
    }
}
