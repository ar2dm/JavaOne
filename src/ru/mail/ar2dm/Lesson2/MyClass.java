package ru.mail.ar2dm.Lesson2;

public class MyClass {
    public static void main(String[] args) {
        int [] nums2 = {0, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 0, 1};
        for (int i = 0; i < nums2.length; i++) {
            if (nums2[i] == 0) {
                nums2[i] = 1;
            }
            else
                nums2[i] = 0;
        }

        int [] arr = new int[8];
        arr[0] = 0;
        for (int i = 1; i < 8; i++){
            arr [i] = arr [i-1] + 3;
        }

        int [] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++){
            if (arr3 [i] < 6) {
                arr3 [i] *= 2;
            }
        }

        int size = 6;
        int [][] table = new int[size][size];
        for (int i = 0; i < size; i++){
            table[i][i] = table[size - 1 - i][i] = 1;
        }

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
