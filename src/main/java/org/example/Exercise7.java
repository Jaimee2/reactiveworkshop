package org.example;

import java.io.IOException;

public class Exercise7 {
    public static void main(String[] args) throws IOException {
        ReactiveSources.intNumbersFlux()
                .filter(e -> e > 5)
                .subscribe(System.out::println);

         ReactiveSources.intNumbersFlux()
                .filter(e -> e > 5)
                 .map(e -> e * 10)
                .subscribe(System.out::println);


         ReactiveSources.intNumbersFlux()
                .filter(e -> e > 5)
                 .map(e -> e * 10)
                 .take(3)
                .subscribe(System.out::println);


         ReactiveSources.intNumbersFlux()
                .filter(e -> e > 10000000)
                 .defaultIfEmpty(-1) //Trigger when the Flux end
                .subscribe(System.out::println);

         ReactiveSources.intNumbersFlux()
                         .flatMap(i -> ReactiveSources.userFlux().filter(user -> user.getId() == i))
                 .subscribe(System.out::println);

         ReactiveSources.intNumbersFluxWithException().subscribe(
                 System.out::println,
                 error -> System.out.println("Error happened")
         );




        System.out.println("Press any key :)");
        System.in.read();
    }
}
