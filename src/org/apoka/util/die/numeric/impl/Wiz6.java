package org.apoka.util.die.numeric.impl;

import org.apoka.util.die.numeric.AbstractDistributedDie;

/**
 * Implementation of a Wiz d6 die.
 *
 * The distribution of this implementation is according to the test made by Mark Fickett in 2015.
 */
public class Wiz6 extends AbstractDistributedDie {
    private static double[] freq = {0.9936687771,
            0.9736754415,
            0.9916694435,
            1.02365878,
            0.9696767744,
            1.047650783
    };

    public Wiz6() {
        super(freq);
    }
}
