package io.mosfet.fizzbuzz.conditions;

/**
 * Created with love.
 * User: mosfet
 * Date: 10/07/19
 * github: kmos
 * twitter: nmosf
 */
public class Buzz extends ModulusRule {

    private static final Integer RULE_NUMBER = 5;
    private static final String RULE = "Buzz";

    @Override
    protected String getRuleString() {
        return RULE;
    }

    @Override
    public Integer getRuleNumber() {
        return RULE_NUMBER;
    }

}
