package org.apoka.util.die.numeric.impl;

import org.apoka.util.die.numeric.AbstractDistributedDie;

/**
 * Implementation of a Chessex d20 die.
 *
 * The distribution of this implementation is according to the test made by Awesome Dice in 2012.
 */
public class Chessex20 extends AbstractDistributedDie {

    private final static double sd = 78.04;
    private static final double mean = 10.491;
    private static final double[] dev = {0.79, 0.834, 1.152, 1.134, 0.976, 1.244, 0.792, 0.886, 1.084,
            1.162, 1.088, 1.108, 0.798, 0.822, 1.124, 1.186, 1.122, 1.116, 0.766, 0.816
    };

    public Chessex20() {
        super(dev);
    }
}
