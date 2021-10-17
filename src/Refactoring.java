/**
 * Java Core1
 * Основы 1. Структура программы, синтаксис, типы данных
 *
 * Лабораторная работа
 */
public class Refactoring {
    public static void main(String[] args) {
        int a, b;
        a = '11';
        b = 5.2;
        System.out.println(m1(a, b));
        System.out.println(m2(a, b));
        System.out.println(m3(a, b));
        System.out.println(m4(a, b));
        System.out.println(m5(a, b));
        System.out.println(m6(a, b));
    }

    private int m1(int a, int b) {
        return a + b;
    }

    private static int m2(int a, int b) {
        return a - b;
    }

    private  int m3(int a, int b) {
        return a * b;
    }

    private static int m4(int a, double b) {
        return a / b;
    }

    private int m5(int a, double b) {
        return Math.pow(b,a);
    }

    private static int m6(int a, double b) {
        return a % b;
    }
}