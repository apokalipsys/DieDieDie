package org.apoka.util.die.numeric.impl;

import org.apoka.util.die.numeric.AbstractDistributedDie;

/**
 * Implementation of a Koplow d6 die.
 *
 * The distribution of this implementation is according to the test made by Mark Fickett in 2015.
 */
public class Koplow6 extends AbstractDistributedDie {
    private static double sd = 0.09;
    private static double mean = 3.51;
    private static double[] dist = {
            1.084,
            0.808,
            1.068,
            1.056,
            0.996,
            0.988
    };

    public Koplow6() {
        super(dist);
    }
}
