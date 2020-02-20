package com.example.helloworld;

public class Operations {

    private float n1;
    private float n2;

    public float getN1() {
        return n1;
    }

    public void setN1(float val) {
        n1 = val;
    }

    public Operations(float a, float b) {
        n1 = a;
        n2 = b;
    }

    private float addition() {
        return n1 + n2;
    }

    private float substraction() {
        return n1 - n2;
    }

    private float multiplication() {
        return n1 * n2;
    }

    private float division() {
        return n1 / n2;
    }

    private int modulo() {
        return (int) (n1 % n2);
    }

    public void solve() {
        float sum = addition();
        System.out.println(n1 + " + " + n2 + " = " + sum);

        float dif = substraction();
        System.out.println(n1 + " - " + n2 + " = " + dif);

        float product = multiplication();
        System.out.println(n1 + " * " + n2 + " = " + product);

        float div = division();
        System.out.println(n1 + " / " + n2 + " = " + div);

        float mod = modulo();
        System.out.println(n1 + " mod " + n2 + " = " + mod);
    }
}
