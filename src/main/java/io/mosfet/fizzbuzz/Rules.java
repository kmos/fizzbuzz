package io.mosfet.fizzbuzz;

import java.util.Collections;
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
class Rules {

    private List<Rule> elements;

    Rules(List<Rule> elements) {
        this.elements = Collections.unmodifiableList(elements);
    }

    String evaluate(Integer number) {
        String result = elements.stream()
                .map(rule -> rule.apply(number))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(joining());

        if (result.equals("")) {
            return String.valueOf(number);
        }

        return result;
    }

}
