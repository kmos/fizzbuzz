package io.mosfet.fizzbuzz;

/**
 * Created with love.
 * User: mosfet
 * Date: 09/11/19
 * github: kmos
 * twitter: nmosf
 */
public class FizzBuzz {

  private final int number;

  public FizzBuzz(int i) {
    this.number = i;
  }

  public String get() {
    if (this.number % 3 == 0) {
      return "fizz";
    }

    if (this.number % 5 == 0) {
      return "buzz";
    }
    return String.valueOf(this.number);
  }
}
