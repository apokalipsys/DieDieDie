package org.apoka.util.die.numeric.impl;

import org.apoka.util.die.numeric.AbstractDistributedDie;
import org.apoka.util.die.numeric.Die;

/**
 * Implementation of a pair of Catan d6 dice.
 *
 * The distribution of this implementation is according to the test made by Mark Fickett in 2015.
 *
 * @see org.apoka.util.die.numeric.set.TwoD6
 */
public class Catan extends Die {

    public static final Die RED = new Red();
    public static final Die YELLOW = new Yellow();

    @Override
    public Integer roll() {
        return RED.roll()+YELLOW.roll();
    }
}

class Red extends AbstractDistributedDie {
    static double[] exp = {0.99798995, 1.013065327, 0.928643216, 1.049246231, 0.952763819, 1.058291457};

    public Red() {
        super(exp);
    }
}

class Yellow extends AbstractDistributedDie {
    static double[] exp = {0.969, 1.032, 0.987, 1.041, 0.969, 1.002};

    public Yellow() {
        super(exp);
    }
}
