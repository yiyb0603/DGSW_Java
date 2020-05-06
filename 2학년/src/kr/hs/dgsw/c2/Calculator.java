package kr.hs.dgsw.c2;

public class Calculator {
    public int plus (int a, int b) {
        return a + b;
    }

    public int minus (int a, int b) {
        return a - b;
    }

    public int multiply (int a, int b) {
        return a * b;
    }

    public int divide (int a, int b) {
        return a / b;
    }

    public double plus (double a, double b) {
        return a + b;
    }

    public double minus (double a, double b) {
        return a - b;
    }

    public double multiply (double a, double b) {
        return a * b;
    }

    public double divide (double a, double b) {
        return a / b;
    }

    public static void main (String[] args) {
        Calculator calc = new Calculator();
        int intValue = calc.plus(3, 5);
        double doubleValue = calc.plus(3.14, 1.414);

        System.out.println("intValue: " + intValue);
        System.out.println("doubleValue : " + doubleValue);
    }
}
