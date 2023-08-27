// Реализация арифметических функций для двух вещественных чисел

package org.example;

import java.text.DecimalFormat;

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

    // Формат округления вещественных чисел до двух знаков после запятой
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        System.out.println("6.7 + 2.3 = " + df.format(sum(6.7, 2.3)));
        System.out.println("0.45 - 0.15 = " + df.format(dec(0.45, 0.15)));
        System.out.println("0.1 * 0.1 = " + df.format(mul(0.1, 0.1)));
        System.out.println("100 / 300 = " + df.format(div(100, 300)));
    }
}