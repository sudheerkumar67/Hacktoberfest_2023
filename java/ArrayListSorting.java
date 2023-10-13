package com.company;

import java.util.*;

public class ArrayListSorting {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();


        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100));
        }

        System.out.println("Original list: " + numbers);


        Collections.sort(numbers, Collections.reverseOrder());

        System.out.println("Sorted list in descending order: " + numbers);


        int maxValue = numbers.get(0);

        System.out.println("Max value after sorting: " + maxValue);
    }
}

