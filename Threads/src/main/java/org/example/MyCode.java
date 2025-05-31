package org.example;

import java.util.Arrays;
import java.util.List;

//@FunctionalInterface
public class MyCode implements Runnable {
    @Override
    public void run() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers.forEach(number -> {
            System.out.println(number);
        });
    }
}
