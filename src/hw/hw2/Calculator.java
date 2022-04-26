package hw.hw2;

public class Calculator {

    public int sum(int a, int b) {
        System.out.println("Сумма чисел типа int");
        return a + b;
    }

    public long sum(long a, long b) {
        System.out.println("Сумма чисел типа long");
        return a + b;
    }

    public double sum(double a, double b) {
        System.out.println("Сумма чисел типа double");
        return a + b;
    }

    public double division(int a, int b) {
        System.out.println("Деление чисел типа int");
        return 1.0 * a / b;
    }

    public double division(long a, long b) {
        System.out.println("Деление чисел типа long");
        return 1.0 * a / b;
    }

    public double division(double a, double b) {
        System.out.println("Деление чисел типа double");
        return a / b;
    }

    public int multiplication(int a, int b) {
        System.out.println("Умножение чисел типа int");
        return a * b;
    }

    public long multiplication(long a, long b) {
        System.out.println("Умножение чисел типа long");
        return a * b;
    }

    public double multiplication(double a, double b) {
        System.out.println("Умножение чисел типа double");
        return a * b;
    }

    public int subtraction(int a, int b) {
        System.out.println("Вычитание чисел типа int");
        return a - b;
    }

    public long subtraction(long a, long b) {
        System.out.println("Вычитание чисел типа Long");
        return a - b;
    }

    public double subtraction(double a, double b) {
        System.out.println("Вычитание чисел типа double");
        return a - b;
    }

}

