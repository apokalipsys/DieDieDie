package org.apoka.util.die.numeric.set;

import org.apoka.util.die.ThrowableObject;
import org.apoka.util.die.numeric.Die;

/**
 * Simulate throw 2 D6.
 * Minimum value of 2 and maximum of 12, with an inclination to give 7.
 */
public class TwoD6 implements ThrowableObject<Integer> {

    private Die internalDice;

    public TwoD6() {
        internalDice = new Die();
    }

    @Override
    public Integer roll() {
        return internalDice.roll()+internalDice.roll();
    }
}
