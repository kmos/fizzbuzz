package io.mosfet.fizzbuzz.conditions;

import java.util.Optional;
import java.util.function.BiPredicate;

/**
 * Created with love.
 * User: mosfet
 * Date: 10/07/19
 * github: kmos
 * twitter: nmosf
 */
public abstract class ModulusRule extends Rule {

    @Override
    Optional<String> transform(Integer number, BiPredicate<Integer, Integer> ruleCondition) {
        if (ruleCondition.test(number, getRuleNumber())) return Optional.of(getRuleString());
        return Optional.empty();
    }

    @Override
    public BiPredicate<Integer, Integer> condition(Integer dividend, Integer divisor) {
        return (integer, integer2) -> integer % integer2 == 0;
    }

    protected abstract String getRuleString();

}
