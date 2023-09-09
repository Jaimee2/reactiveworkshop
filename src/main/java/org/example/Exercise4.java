package org.example;

import java.io.IOException;
import java.util.List;

public class Exercise4 {

    public static void main(String[] args) throws IOException {

        Integer number = ReactiveSources.intNumberMono().block();
        System.out.println("number is: " + number);

        User user = ReactiveSources.userMono().block();
        System.out.println("User is: " + user);

        System.out.println("Press any Key");
        System.in.read();
    }
}
