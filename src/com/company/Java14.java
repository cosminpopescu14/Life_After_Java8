package com.company;

public class Java14 {

    public static void main(String[] args) {
        var point = new Point(20, 30);
        System.out.println(point);
    }
}
record Point(int x, int y) {}