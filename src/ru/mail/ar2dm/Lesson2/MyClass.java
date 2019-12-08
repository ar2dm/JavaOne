package ru.mail.ar2dm.Lesson2;

public class MyClass {
    public static void main(String[] args) {

        // 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int [] nums2 = {0, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 0, 1};
        for (int i = 0; i < nums2.length; i++) {
            if (nums2[i] == 0) {
                nums2[i] = 1;
            }
            else
                nums2[i] = 0;
        }

        // 2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить
        // его значениями 0 3 6 9 12 15 18 21;
        int [] arr = new int[8];
        arr[0] = 0;
        for (int i = 1; i < 8; i++){
            arr [i] = arr [i-1] + 3;
        }

        // 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа
        // меньшие 6 умножить на 2;
        int [] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++){
            if (arr3 [i] < 6) {
                arr3 [i] *= 2;
            }
        }

        // 4. Создать квадратный двумерный целочисленный массив (количество строк
        // и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные
        // элементы единицами;
        int size = 6;
        int [][] table = new int[size][size];
        for (int i = 0; i < size; i++){
            table[i][i] = table[size - 1 - i][i] = 1;
        }

        // 5. ** Задать одномерный массив и найти в нем минимальный и максимальный
        // элементы (без помощи интернета);
        int [] arr5 = {1, 5, 3, -1, 19, 0, 45, -7, 2, 11, 4, 5, 2, 49, 8, 9, 1, -8};
        int minElement = arr5[0], maxElement = arr5[0];
        for (int i = 0; i < arr5.length; i++) {
            if (maxElement < arr5[i]) {
                maxElement = arr5[i];
            }
            if (minElement > arr5[i]) {
                minElement = arr5[i];
            }
        }
    }

    // 6. ** Написать метод, в который передается не пустой одномерный целочисленный
    // массив, метод должен вернуть true, если в массиве есть место, в котором сумма
    // левой и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
    // checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||,
    // эти символы в массив не входят.
    public static boolean checkBalance(int [] arr){
        int sumLeft = 0, sumRight = 0;
        boolean check = false;
        for (int i = 0; i < (arr.length - 1); i++){
            for (int j = 0; j <= i; j++){
                sumLeft += arr[j];
            }
            for (int j = i +1; j < arr.length; j++){
                sumRight += arr[j];
            }
            check = (sumLeft == sumRight);
            if (check) {
                break;
            }
            sumLeft = 0;
            sumRight = 0;
        }
        return check;
    }

    // 7. **** Написать метод, которому на вход подается одномерный массив и
    // число n (может быть положительным, или отрицательным), при этом метод должен
    // сместить все элементымассива на n позиций.
    // Для усложнения задачи нельзя пользоваться вспомогательными массивами.
    public static void arrayShift (int [] arr, int n){
        int storage;
        System.out.println("Shift on " + n);
        n = n % arr.length; //Чтобы не "гонять" цикл лишнее количество раз.
        if (n > 0) {
            for (int j = 0; j < n; j++) {
                storage = arr[arr.length - 1];
                for (int i = (arr.length - 1); i > 0; i--) {
                    arr[i] = arr[i - 1];
                }
                arr[0] = storage;
            }
        }
        else if (n < 0){
            for (int j = n; j < 0; j++ ) {
                storage = arr[0];
                for (int i = 0; i < (arr.length - 1); i++) {
                    arr[i] = arr[i + 1];
                }
                arr[arr.length - 1] = storage;
            }
        }
    }
}
