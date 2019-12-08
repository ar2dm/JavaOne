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
    }
}
