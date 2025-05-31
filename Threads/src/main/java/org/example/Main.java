package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("A");

        System.out.println("B");

        MyCode myCode = new MyCode();
        Thread thread = new Thread(myCode);
        thread.start();

        System.out.println("C");

        // Functional Interface
        Thread thread1 = new Thread(() -> {
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

            numbers.forEach(number -> {
                System.out.println(number);
            });
        });

        thread1.run();
    }
}