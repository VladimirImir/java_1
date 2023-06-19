package com.dev.lesson5;

public class Lesson5Example {

    public static void main(String[] args) {
        int value = 2000;
        isLeapYear(value);
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
        /*if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " Высокосный.");
            return true;
        } else {
            System.out.println(year + " Не высокосный.");
            return false;
        }*/
    }
}
