package com.company;

public class Java15 {

    public static void main(String[] args) {

        record Point(int x, int y) {} // is local, in the main

        var point = new Point(1, 2);
        System.out.println(point);
    }
}
