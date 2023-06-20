package com.dev.lesson7.task;

/**
 * 2. Написать программу, заносящую в массив первые 100 целых чисел, делящихся на 13 или на 17, и печатающую его.
 */

public class Task2 {

    public static void main(String[] args) {
        int[] values = new int[100];
        fillArray(values);
        Task1.printArray(values);
    }

    public static void fillArray(int[] values) {
        int currenIndex = 0;
        for (int currentValue = 1; currenIndex < values.length; currentValue++) {
            if (currentValue % 13 == 0 || currentValue % 17 == 0) {
                values[currenIndex] = currentValue;
                currenIndex++;
            }
        }
    }
}
