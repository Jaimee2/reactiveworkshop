package org.example;

import java.io.IOException;

public class Exercise2 {

    public static void main(String[] args) throws IOException {

        ReactiveSources.intNumbersFlux().subscribe(System.out::println);

        ReactiveSources.userFlux().subscribe(System.out::println);

        System.out.println("Press a key to end");
        System.in.read();
    }
}
