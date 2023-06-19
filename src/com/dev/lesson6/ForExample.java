package com.dev.lesson6;

public class ForExample {

    public static void main(String[] args) {
        // forExamole();
        for (int value = 10; value > 0; value--) {
            if (value == 5) {
                continue;
                //break;
            }
            System.out.println(value);
        }
    }

    private static void forExamole() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }
}
