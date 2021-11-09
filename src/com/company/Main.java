package com.company;

import sun.misc.Unsafe;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("there it is!");

        Runnable runnable = () -> System.out.println("Hello world two!");
        runnable.run();
        record Point(int x, int y) {
        }

        var p = new Point(3, 2);
        System.out.println(p);

        System.out.println(test(new Main()));


    }

    public static String test(Object obj) {

        return switch (obj) {

            case Integer i -> "An integer";

            case String s -> "A string";

            case Main c -> "This app";

            default -> "I don't know what it is";

        };

    }
}
