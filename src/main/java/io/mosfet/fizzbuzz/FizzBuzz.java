package io.mosfet.fizzbuzz;

import java.util.Arrays;
import java.util.function.BiPredicate;

/**
 * Created with love.
 * User: mosfet
 * Date: 10/07/19
 * github: kmos
 * twitter: nmosf
 */
class FizzBuzz {

    private static final BiPredicate<Integer, Integer> FIZZ_BUZZ_CONDITION = (dividend, divisor) -> dividend % divisor == 0;
    private static final int FIZZ_NUMBER = 3;
    private static final int BUZZ_NUMBER = 5;
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final Rules RULES = new Rules(Arrays.asList(
            new Rule(FIZZ_NUMBER, FIZZ_BUZZ_CONDITION, FIZZ),
            new Rule(BUZZ_NUMBER, FIZZ_BUZZ_CONDITION, BUZZ)));

    private Number number;

    FizzBuzz(int value) {
        this.number = new Number(value, RULES);
    }

    String get() {
        return number.get();
    }
}
