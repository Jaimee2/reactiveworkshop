package org.example;

import java.util.List;

public class Exercise3 {

    public static void main(String[] args) {

        List<Integer> numbers = ReactiveSources.intNumbersFlux().toStream().toList();

        System.out.println("List is: " + numbers);
        System.out.println("Size: " + numbers.size());

    }
}
