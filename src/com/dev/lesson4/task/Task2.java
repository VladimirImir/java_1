package com.dev.lesson4.task;

/**
 * 2. Дано целое число. Определить, является ли последняя цифра этого числа – цифрой 3.
 */

public class Task2 {

    public static void main(String[] args) {
        int value = 912313;
        if (value % 10 == 3) {
            System.out.println("Последняя цифра числа является 3.");
        }
    }
}
