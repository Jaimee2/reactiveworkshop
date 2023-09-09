package org.example;

import java.io.IOException;

public class Exercise5 {

    public static void main(String[] args) throws IOException {

        ReactiveSources.intNumbersFlux().subscribe(
                System.out::println, //Print normal items
                System.out::println, // Print error if there are someone
                () -> System.out.println("Completed !!!") // When the Stream is ended
        );

        System.out.println("Press any key :)");
        System.in.read();
    }
}
