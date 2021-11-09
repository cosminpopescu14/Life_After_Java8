package com.company;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java12 {

    public static void main(String[] args) {
         howMany(12);


        var result =
                Stream.of(5, 12, 19, 21)
                        .collect(Collectors.teeing(
                                // first collector
                                Collectors.counting(),
                                // second collector
                                Collectors.summingInt(n -> Integer.parseInt(n.toString())),
                                // merger: (count, sum) -> new Result(count, sum);
                                Result::new
                        ));

        System.out.println(result); // -> {count=4, sum=57}

    }

    static void howMany(int k) {
        switch (k) {
            case 1 -> System.out.println("one");
            case 2 -> System.out.println("two");
            case 3 -> System.out.println("many");
            default ->  {
                System.out.println(1 + 2);
                System.out.println("too many");
            }
        }
    }
}

class Result {
    private Long count;
    private Integer sum;

    public Result(Long count, Integer sum) {
        this.count = count;
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "{" +
                "count=" + count +
                ", sum=" + sum +
                '}';
    }}
