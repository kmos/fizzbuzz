package io.mosfet.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created with love.
 * User: mosfet
 * Date: 09/11/19
 * github: kmos
 * twitter: nmosf
 */
public class FizzBuzzTest {

  @Test
  void whenFizzBuzzOneThenIgetBackOneAsString() {
    FizzBuzz fizzBuzz = new FizzBuzz(1);
    assertEquals("1", fizzBuzz.get());
  }

  @Test
  void whenFizzBuzzTwoThenIgetBackTwoAsString() {
    FizzBuzz fizzBuzz = new FizzBuzz(2);
    assertEquals("2", fizzBuzz.get());
  }

  @Test
  void whenFizzBuzzFourThenIgetBackFourAsString() {
    FizzBuzz fizzBuzz = new FizzBuzz(4);
    assertEquals("4", fizzBuzz.get());
  }

  @Test
  void whenFizzBuzzThreeThenIgetBackFizz() {
    FizzBuzz fizzBuzz = new FizzBuzz(3);
    assertEquals("fizz", fizzBuzz.get());
  }

  @Test
  void whenFizzBuzzFiveThenIgetBackBuzz() {
    FizzBuzz fizzBuzz = new FizzBuzz(5);
    assertEquals("buzz", fizzBuzz.get());
  }

  @Test
  void whenFizzBuzzSixThenIgetBackFizz() {
    FizzBuzz fizzBuzz = new FizzBuzz(6);
    assertEquals("fizz", fizzBuzz.get());
  }

  @Test
  void whenFizzBuzzTenThenIgetBackBuzz() {
    FizzBuzz fizzBuzz = new FizzBuzz(10);
    assertEquals("buzz", fizzBuzz.get());
  }
}
