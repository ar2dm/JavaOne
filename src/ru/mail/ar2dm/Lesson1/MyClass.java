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
}
