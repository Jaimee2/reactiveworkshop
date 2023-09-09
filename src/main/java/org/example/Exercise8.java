package org.example;

import java.io.IOException;

public class Exercise8 {
    public static void main(String[] args) throws IOException {
        ReactiveSources.intNumbersFluxWithException().subscribe(
                System.out::println,
                error -> System.out.println("Error happened")
        );




        System.out.println("Press any key :)");
        System.in.read();
    }
}
