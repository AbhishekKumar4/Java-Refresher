package com.abhishek.java8.functional.streamsex;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTerminalCollectExample {

    public static void main(String[] args) {
        // Converting Stream to List using collect() method
        List<String> listOfString = Arrays.asList("Java", "C", "C++", "Go", "JavaScript", "Python", "Scala");
        List<String> listOfStringStartsWithJ = listOfString.stream()
                                                .filter(s -> s.startsWith("J"))
                                                .collect(Collectors.toList());
        System.out.println("list of String starts with letter J: " + listOfStringStartsWithJ);

        // Example 2 - converting Stream to Set
        Set<String> setOfStringStartsWithC = listOfString.stream()
                                                        .filter(s -> s.startsWith("C"))
                                                        .collect(Collectors.toSet());
        System.out.println("set of String starts with letter C: " + setOfStringStartsWithC);

        // Example 3 - converting Stream to Map
        Map<String, Integer> stringToLength = listOfString.stream()
                .collect(Collectors.toMap(Function.identity(), String::length));
        System.out.println("map of string and their length: " + stringToLength);

        // Example 4 - Converting Stream to Collection e.g. ArrayList
        ArrayList<String> stringWithLengthGreaterThanTwo = listOfString.stream()
                .filter(s -> s.length() > 2)
                .collect(Collectors. toCollection(ArrayList::new));
        System.out.println("collection of String with length greater than 2: " + stringWithLengthGreaterThanTwo);

    }
}
