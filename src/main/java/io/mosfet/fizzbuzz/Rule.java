package io.mosfet.fizzbuzz;

import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;

/**
 * Created with love.
 * User: mosfet
 * Date: 09/07/19
 * github: kmos
 * twitter: nmosf
 */
public class Rule implements Function<Integer, Optional<String>> {

    private final int number;
    private final String word;
    private final BiPredicate<Integer, Integer> condition;

    Rule(int number, BiPredicate<Integer, Integer> condition, String word) {
        this.number = number;
        this.condition = condition;
        this.word = word;
    }

    @Override
    public Optional<String> apply(Integer number) {
        if (condition.test(number, this.number)) return Optional.of(this.word);
        return Optional.empty();
    }
}