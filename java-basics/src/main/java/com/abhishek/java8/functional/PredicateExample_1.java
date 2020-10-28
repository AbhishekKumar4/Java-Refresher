package com.abhishek.java8.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample_1 {

    public static void main(String[] args) {
        // Example 1
        // Creating predicate
        Predicate<Integer> lesserthan = i -> (i < 18);
        // Calling Predicate method
        System.out.println(lesserthan.test(10));

        //Example 2 Predicate Chaining
        Predicate<Integer> greaterThanTen = (i) -> i > 10;

        // Creating predicate
        Predicate<Integer> lowerThanTwenty = (i) -> i < 20;
        boolean result = greaterThanTen.and(lowerThanTwenty).test(15);
        System.out.println(result);

        // Calling Predicate method
        boolean result2 = greaterThanTen.and(lowerThanTwenty).negate().test(15);
        System.out.println(result2);

        //Example 3 using objects
        List<User> users = new ArrayList<User>();
        users.add(new User("John", "admin"));
        users.add(new User("Peter", "member"));

        List admins = users.stream()
                .filter((user) -> user.getRole().equals("admin"))
                .collect(Collectors.toList());

        System.out.println(admins);
    }
}

    class User
    {
        String name;

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", role='" + role + '\'' +
                    '}';
        }

        String role;
        User(String a, String b) {
            name = a;
            role = b;
        }
        String getRole() { return role; }
        String getName() { return name; }

    }
