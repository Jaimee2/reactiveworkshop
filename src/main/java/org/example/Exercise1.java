package org.example;

public class Exercise1 {
    public static void main(String[] args) {

        StreamSources.intNumbersStream().forEach(System.out::println);

        StreamSources.intNumbersStream().filter(num -> num < 5).forEach(System.out::println);

        StreamSources.intNumbersStream()
                .filter(num -> num > 5)
                .skip(1)
                .limit(2).forEach(System.out::println);

        int number = StreamSources.intNumbersStream()
                .filter(num -> num > 5)
                .findFirst().orElse(-1);
        System.out.println(number);

        StreamSources.userStream().map(User::getFirstName).forEach(System.out::println);

        StreamSources.userStream()
                .filter(user ->
                        StreamSources.intNumbersStream().anyMatch(i -> i == user.getId()))
                .forEach(System.out::println);
        
        System.out.println("Second form");

        StreamSources.intNumbersStream()
                .flatMap(id ->
                        StreamSources.userStream().filter(user -> user.getId() == id))
                .forEach(System.out::println);
    }
}