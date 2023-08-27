package org.example;

public class Main {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int dec(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static float div(float a, float b) {
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println("2 + 7 = " + sum(2, 7));
        System.out.println("9 - 6 = " + dec(9, 6));
        System.out.println("5 * 5 = " + mul(5, 5));
        System.out.println("30 / 4 = " + div(30, 4));
    }
}