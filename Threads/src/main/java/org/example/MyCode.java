package org.example;

import java.util.Arrays;
import java.util.List;

public class MyCode implements Runnable {
    @Override
    public void run() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.forEach(number -> {
            System.out.println(number);
        });
    }
}
