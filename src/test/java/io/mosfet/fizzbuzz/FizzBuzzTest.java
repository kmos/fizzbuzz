package io.mosfet.fizzbuzz;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created with love.
 * User: mosfet
 * Date: 08/07/19
 * github: kmos
 * twitter: nmosf
 */
class FizzBuzzTest {


    private static final String ONE = "1";
    private static final String TWO = "2";
    private static final String FOUR = "4";
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";

    @Test
    @DisplayName("when I fizzbuzz number 1, I get back a string representing it")
    void whenNumber1ThenReturnStringOf1() {

        FizzBuzz fizzBuzz = new FizzBuzz(1);
        assertEquals(ONE, fizzBuzz.get());
    }

    @Test
    @DisplayName("when I fizzbuzz number 2, I get back a string representing it")
    void whenNumber2ThenReturnStringOf2() {
        FizzBuzz fizzBuzz = new FizzBuzz(2);
        assertEquals(TWO, fizzBuzz.get());
    }

    @Test
    @DisplayName("when I fizzbuzz number 4, I get back a string representing it")
    void whenNumber4ThenReturnStringOf4() {
        FizzBuzz fizzBuzz = new FizzBuzz(4);
        assertEquals(FOUR, fizzBuzz.get());

    }

    @Test
    @DisplayName("when I fizzbuzz number 3, I get back Fizz")
    void whenNumber3ThenReturnFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz(3);
        assertEquals(FIZZ, fizzBuzz.get());
    }

    @Test
    @DisplayName("when I fizzbuzz number 5, I get back Buzz")
    void whenNumber5ThenReturnBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz(5);
        assertEquals(BUZZ, fizzBuzz.get());
    }

    @Test
    @DisplayName("when I fizzbuzz number 9, I get back fizz")
    void whenNumber9ThenReturnFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz(9);
        assertEquals(FIZZ, fizzBuzz.get());
    }

    @Test
    @DisplayName("when I fizzbuzz number 10, I get back buzz")
    void whenNumber10ThenReturnBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz(10);
        assertEquals(BUZZ, fizzBuzz.get());
    }

    @Test
    @DisplayName("when I fizzbuzz number 15, I get back fizzbuzz")
    void whenNumber15ThenReturnFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz(15);
        assertEquals(FIZZ + BUZZ, fizzBuzz.get());
    }
}
