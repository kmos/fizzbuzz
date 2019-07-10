package io.mosfet.fizzbuzz;

import io.mosfet.fizzbuzz.conditions.Buzz;
import io.mosfet.fizzbuzz.conditions.Fizz;

/**
 * Created with love.
 * User: mosfet
 * Date: 10/07/19
 * github: kmos
 * twitter: nmosf
 */
class FizzBuzz {

    private Number number;

    FizzBuzz(int number) {
        this.number = new Number.Builder()
                .addRule(new Fizz())
                .addRule(new Buzz())
                .build(number);
    }

    String get() {
        return number.get();
    }
}
