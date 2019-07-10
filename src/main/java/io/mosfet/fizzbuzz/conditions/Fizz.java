package io.mosfet.fizzbuzz.conditions;

/**
 * Created with love.
 * User: mosfet
 * Date: 09/07/19
 * github: kmos
 * twitter: nmosf
 */
public class Fizz extends ModulusRule {

    private static final Integer RULE_NUMBER = 3;
    private static final String RULE = "Fizz";

    @Override
    protected String getRuleString() {
        return RULE;
    }

    @Override
    public Integer getRuleNumber() {
        return RULE_NUMBER;
    }
}
