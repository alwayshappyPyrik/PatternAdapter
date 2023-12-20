package org.example;

public class Main {
    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculator();
        System.out.println("Операция сложения ");
        System.out.println("Результат " + intsCalc.sum(2, 2));
        System.out.println("Операция умножения ");
        System.out.println("Результат " + intsCalc.mult(10, 22));
        System.out.println("Операция возведения в степень ");
        System.out.println("Результат " + intsCalc.pow(2, 10));
    }
}