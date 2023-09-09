package org.example;

import java.io.IOException;
import java.time.Duration;

import static java.time.temporal.ChronoUnit.SECONDS;


public class Exercise6 {

    public static void main(String[] args) throws IOException {

        ReactiveSources.intNumberMono().block(Duration.of(2, SECONDS));

        System.out.println("Press any key :)");
        System.in.read();
    }
}
