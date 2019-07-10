package io.mosfet.fizzbuzz;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Application
{
    public static void main( String[] args ) {

        List<FizzBuzz> fizzBuzzes = IntStream.range(1, 50)
                .mapToObj(FizzBuzz::new)
                .collect(Collectors.toList());

        fizzBuzzes.stream()
                .map(FizzBuzz::get)
                .forEach(System.out::println);
    }
}