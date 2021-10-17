/**
 * Java Core1
 * Основы 1. Структура программы, синтаксис, типы данных
 *
 * Лабораторная работа
 */
public class Refactoring {
    public static void main(String[] args) {
        double a, b;
        a = 11;
        b = 5.2;
        System.out.println(sum(a, b));
        System.out.println(dif(a, b));
        System.out.println(mul(a, b));
        System.out.println(div(a, b));
        System.out.println(exp(a, b));
        System.out.println(mod(a, b));
    }

    private static double sum(double a, double b) {
        return a + b;
    }

    private static double dif(double a, double b) {
        return a - b;
    }

    private static double mul(double a, double b) {
        return a * b;
    }

    private static double div(double a, double b) {
        return a / b;
    }

    private static double exp(double a, double b) {
        return Math.pow(b,a);
    }

    private static double mod(double a, double b) {
        return a % b;
    }
}