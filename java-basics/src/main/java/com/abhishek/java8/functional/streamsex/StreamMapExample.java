package com.abhishek.java8.functional.streamsex;

import java.util.Arrays;
import java.util.List;

public class StreamMapExample {
    public static void main(String[] args) {
        // Creating a list of Integers
        List<Integer> list = Arrays.asList(3, 6, 9, 12, 15);

        // Using Stream map(Function mapper) and
        // displaying the corresponding new stream
        list.stream().map(number -> number * 3).forEach(System.out::println);
    }
}
