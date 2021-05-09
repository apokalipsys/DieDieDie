package org.apoka.util.die.numeric;

import org.apoka.util.die.ThrowableObject;

import java.util.List;
import java.util.Random;

/**
 * Some games uses a special numbered dice. This can be useful for those cases.
 *
 */
public abstract class CustomNumberDie extends Die {
    @Override
    public Integer roll() {
        int rnd = new Random().nextInt(getValues().length);
        return getValues()[rnd];
    }

    public abstract Integer[] getValues();
}
