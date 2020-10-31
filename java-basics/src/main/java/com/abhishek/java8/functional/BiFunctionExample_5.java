package com.abhishek.java8.functional;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionExample_5 {

    public static void main(String[] args) {

        Function<Integer, Integer> function = a -> a * 2;
        System.out.println(function.apply(5));

        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a * b;
        System.out.println(biFunction.apply(2,3));

    }
}
