package io.mosfet.fizzbuzz;

/**
 * Created with love.
 * User: mosfet
 * Date: 08/07/19
 * github: kmos
 * twitter: nmosf
 */
class Number {

    private int value;
    private Rules rules;

    Number(int value, Rules rules) {

        this.value = value;
        this.rules = rules;
    }

    String get() {

        return rules.evaluate(value);
    }

}
