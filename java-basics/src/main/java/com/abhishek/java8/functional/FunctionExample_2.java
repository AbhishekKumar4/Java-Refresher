package com.abhishek.java8.functional;

import java.util.function.Function;

public class FunctionExample_2 {
    public static void main(String[] args) {
        // Example 1
        // Function which takes in a number
        // and returns half of it
        Function<Integer, Double> half = a -> a / 2.0;
        // apply the function to get the result
        System.out.println(half.apply(10));

        //Example 2 - andThen
        // Function which takes in a number and
        // returns half of it
        Function<Integer, Double> half2 = a -> a / 2.0;
        // Now treble the output of half function
        half2 = half2.andThen(a -> 3 * a);
        // apply the function to get the result
        System.out.println(half2.apply(10));

        //Example 3- compose
        // Function which takes in a number and
        // returns half of it
        Function<Integer, Double> half3 = a -> a / 2.0;
        // However treble the value given to half function
        half3 = half3.compose(a -> 3 * a);
        // apply the function to get the result
        System.out.println(half3.apply(5));

    }
}
