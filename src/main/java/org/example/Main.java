// Реализация арифметических функций для двух вещественных чисел

package org.example;


public class Main {
    // Сложение двух вещественных чисел
    public static double sum(double a, double b) {
        return a + b;
    }
    // Вычитание двух вещественных чисел
    public static double dec(double a, double b) {
        return a - b;
    }
    // Умножение двух вещественных чисел
    public static double mul(double a, double b) {
        return a * b;
    }
    // Деление двух вещественных чисел
    public static double div(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println("6.7 + 2.3 = " + sum(6.7, 2.3));
        System.out.println("0.45 - 0.15 = " + dec(0.45, 0.15));
        System.out.println("0.1 * 0.1 = " + mul(0.1, 0.1));
        System.out.println("100 / 300 = " + div(100, 300));
    }
}