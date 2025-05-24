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
    }
}