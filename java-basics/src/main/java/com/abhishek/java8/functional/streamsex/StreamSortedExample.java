package com.abhishek.java8.functional.streamsex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamSortedExample {
    public static void main(String[] args) {
        // Creating a list of integers
        List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4);

        System.out.println("The sorted stream is : ");
        // displaying the stream with elements
        // sorted in natural order
        list.stream().sorted().forEach(System.out::println);


        // with comparable
        List<Point> aList = new ArrayList<>();
        aList.add(new Point(10, 20));
        aList.add(new Point(5, 10));
        aList.add(new Point(1, 100));
        aList.add(new Point(50, 2000));

        // displaying the stream with elements
        // sorted according to x coordinate
        aList.stream()
                .sorted((p1, p2)->p1.x.compareTo(p2.x))
                .forEach(System.out::println);


        aList.stream()
                .sorted(Comparator.comparingInt(Point::getX))
                .forEach(System.out::println);
    }
}


class Point
{
    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    Integer x, y;
    Point(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return this.x + ", "+ this.y;
    }
}
