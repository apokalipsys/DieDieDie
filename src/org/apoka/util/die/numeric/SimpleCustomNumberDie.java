package org.apoka.util.die.numeric;

/**
 * Simple implementation of a die with special numbering on each side
 */
public class SimpleCustomNumberDie extends CustomNumberDie {
    Integer[] sides;

    public SimpleCustomNumberDie(Integer... sides){
        this.sides = sides;
    }

    @Override
    public Integer[] getValues() {
        return sides;
    }
}
