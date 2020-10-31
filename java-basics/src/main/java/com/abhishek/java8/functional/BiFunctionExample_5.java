package com.abhishek.java8.functional;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionExample_5 {

    public static void main(String[] args) {

        Function<Integer, Integer> function = a -> {
            System.out.println("I am function");
            return a * 2;
        };
        //System.out.println(function.apply(5));

        Function<Integer, Integer> function2 = a -> {
            System.out.println("I am function 2");
            return a + 2;
        };

        //System.out.println(function.andThen(function2).apply(2));
        System.out.println(function.compose(function2).apply(2));

        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a * b;
        //System.out.println(biFunction.apply(2,3));

    }
}
