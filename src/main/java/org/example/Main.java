package org.example;

public class Main {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int dec(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        System.out.println("2 + 7 = " + sum(2, 7));
        System.out.println("9 - 6 = " + dec(9, 6));
    }
}