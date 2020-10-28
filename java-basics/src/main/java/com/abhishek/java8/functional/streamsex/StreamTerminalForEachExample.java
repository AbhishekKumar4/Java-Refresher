package com.abhishek.java8.functional.streamsex;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamTerminalForEachExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);

        // Using forEach(Consumer action) to
        // print the elements of stream
        // in reverse order
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

    }
}
