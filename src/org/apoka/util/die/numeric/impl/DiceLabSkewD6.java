package org.apoka.util.die.numeric.impl;

import org.apoka.util.die.numeric.AbstractDistributedDie;

/**
 * Implementation of a Dice Lab's d6 skew die.
 *
 * The distribution of this implementation is according to the test made by Mark Fickett in 2015.
 */
public class DiceLabSkewD6 extends AbstractDistributedDie {

    private double[] clockwise_f = {0.696, 1.116, 0.932, 1.316, 1.056, 0.884};

    private double[] counterclockwise_f = {0.807, 1.128, 0.999, 1.26, 0.951, 0.855};

    public enum direction {
        CLOCKWISE,
        COUNTERCLOCKWISE
    }

    private DiceLabSkewD6(double[] freq) {
        super(freq);
    }

    public DiceLabSkewD6 getInstance(direction d) {
        if(d.equals(direction.CLOCKWISE)) {
            return new DiceLabSkewD6(clockwise_f);
        } else if (d.equals(direction.COUNTERCLOCKWISE)) {
            return new DiceLabSkewD6(counterclockwise_f);
        } else {
            //unsupported
            throw new UnsupportedOperationException();
        }
    }
}
