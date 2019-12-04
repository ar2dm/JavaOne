package ru.mail.ar2dm.Lesson1;

public class MyClass {
    public static void main(String[] args) {
        byte b=10;
        short s=2404;
        int i=123456;
        long l=1500L;
        float f=120.0f;
        double d=15.72775;
        boolean bool=true;
        char c='X';
        String str = "String";
    }

    // Метод, вычисляющий выражение a * (b + (c / d))
    public static double Calculate(double a, double b, double c, double d) {
        return a * (b + (c / d));
    }

    // Метод, проверяющий, что сумма числе лежит в пределах от 10 до 20
    public static boolean check(double A, double B){
        boolean result = false;
        if ((A + B) <= 20 && (A + B) > 10){
            result = true;
        }
        return result;
    }

    // Метод, выводящий в консоль сообщение, положительное число ему передали или отрицательное
    public static void defineNegative(int A) {
        boolean res = false;
        if (A < 0) {
            System.out.println("Entered number is negative");
        } else {
            System.out.println("Entered number is positive");
        }
    }

    // Метод, возвращающий true, если переданное число отрицательное
    public static boolean isNegative(int A) {
        return A < 0;
    }

    // Метод sayHello
    public static void sayHello(String name) {
        System.out.println("Привет, " + name + "!");
    }
}
