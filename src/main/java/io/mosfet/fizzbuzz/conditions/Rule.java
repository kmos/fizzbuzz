package io.mosfet.fizzbuzz.conditions;

import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

/**
 * Created with love.
 * User: mosfet
 * Date: 09/07/19
 * github: kmos
 * twitter: nmosf
 */
public abstract class Rule implements BiFunction<Integer, BiPredicate<Integer, Integer>, Optional<String>> {

    @Override
    public Optional<String> apply(Integer number, BiPredicate<Integer, Integer> ruleCondition) {
        return transform(number, ruleCondition);
    }

    abstract Optional<String> transform(Integer number, BiPredicate<Integer, Integer> ruleCondition);

    public abstract BiPredicate<Integer, Integer> condition(Integer dividend, Integer divisor);

    public abstract Integer getRuleNumber();
}