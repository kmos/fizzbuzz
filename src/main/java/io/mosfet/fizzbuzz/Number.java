package io.mosfet.fizzbuzz;

import io.mosfet.fizzbuzz.conditions.Rule;
import io.mosfet.fizzbuzz.conditions.Rules;

/**
 * Created with love.
 * User: mosfet
 * Date: 08/07/19
 * github: kmos
 * twitter: nmosf
 */
public class Number {

    private  int value;
    private Rules rules;

    public Number(int value, Rules rules) {

        this.value = value;
        this.rules = rules;
    }

    private Number(Builder builder) {
        value = builder.value;
        rules = builder.rules;
    }

    String get() {

        return rules.evaluate(value);
    }

    public static final class Builder {
        private int value;
        private Rules rules;

        Builder() {
            rules = new Rules();
        }

        public Builder rules(Rules rules) {
            this.rules.addAll(rules);
            return this;
        }

        Builder addRule(Rule rule) {
            this.rules.add(rule);
            return this;
        }

        Number build(int value) {
            this.value = value;
            return new Number(this);
        }
    }
}
