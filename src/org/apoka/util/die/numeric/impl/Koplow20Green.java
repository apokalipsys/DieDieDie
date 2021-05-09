package org.apoka.util.die.numeric.impl;

import org.apoka.util.die.numeric.AbstractDistributedDie;

/**
 * Implementation of a Koplow d20 die.
 *
 * The distribution of this implementation is according to the test made by Mark Fickett in 2015.
 */
public class Koplow20Green extends AbstractDistributedDie {
    private static double sd = 0.124276127;
    private static double mean = 10.47017661;
    private static double[] freq = {0.973008997,
        1.07964012,
        0.9330223259,
        1.186271243,
        1.106297901,
        0.973008997,
        0.8063978674,
        0.9196934355,
        0.8330556481,
        1.099633456,
        1.126291236,
        0.9263578807,
        0.9596801066,
        1.039653449,
        0.8397200933,
        1.226257914,
        1.119626791,
        1.072975675,
        0.8263912029,
        0.9530156614};

    public Koplow20Green() {
        super(freq);
    }
}
