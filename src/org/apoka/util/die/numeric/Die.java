package org.apoka.util.die.numeric;

import org.apoka.util.die.ThrowableObject;

import java.util.concurrent.ThreadLocalRandom;

/**
 * A "perfect dice" implementation.
 * This mean that is <i>true random</i> (as random as Java can generate).
 * Real dice have imperfections.
 */
public class Die implements ThrowableObject<Integer> {
    int sides;
    int minimum = 1;

    public Die() {
        sides = 6;
    }

    public Die(int sides) {
        this.sides = sides;
    }

    public Integer roll() {
        return ThreadLocalRandom.current().nextInt(minimum, sides + 1);
    }
}
