package io.mosfet.fizzbuzz.conditions;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.joining;

/**
 * Created with love.
 * User: mosfet
 * Date: 09/07/19
 * github: kmos
 * twitter: nmosf
 */
public class Rules {

    private List<Rule> elements;

    public Rules() {
        this.elements = new ArrayList<>();
    }

    public void add(Rule rule) {
        elements.add(rule);
    }

    public String evaluate(Integer number) {
        String result = elements.stream()
                .map(rule -> rule.apply(number, rule.condition(number, rule.getRuleNumber())))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(joining());

        if (result.equals("")) {
            return String.valueOf(number);
        }

        return result;
    }

    public void addAll(Rules rules) {
        this.elements.addAll(rules.elements);
    }
}
