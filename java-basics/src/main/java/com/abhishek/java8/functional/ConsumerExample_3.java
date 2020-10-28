package com.abhishek.java8.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample_3 {
    public static void main(String[] args) {
        // Consumer to display a number
        Consumer<Integer> display = a -> System.out.println(a);
        display.accept(10);

        // Consumer to display a list of numbers
        Consumer<List<Integer>> dispList = list -> list.stream().forEach(a -> System.out.print(a + " "));
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(1);
        list.add(3);
        // Implement dispList using accept()
        dispList.accept(list);

        // Consumer andThen
        // Consumer to multiply 2 to every integer of a list
        Consumer<List<Integer> > modify = list1 ->
        {
            for (int i = 0; i < list1.size(); i++)
                list1.set(i, 2 * list1.get(i));
        };

        // Consumer to display a list of integers
        Consumer<List<Integer>> dispList1 = list1 -> list1.stream().forEach(a -> System.out.print(a + " "));

        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(2);
        list1.add(1);
        list1.add(3);

        // using addThen()
        modify.andThen(dispList1).accept(list1);
        ;
    }
}