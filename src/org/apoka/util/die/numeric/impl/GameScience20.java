package org.apoka.util.die.numeric.impl;

import org.apoka.util.die.numeric.AbstractDistributedDie;

/**
 * Implementation of a Game Science d20 die.
 *
 * The distribution of this implementation is according to the test made by Awesome Dice in 2012.
 */
public class GameScience20 extends AbstractDistributedDie {

    private static double sd = 60.89;
    private static double mean = 10.3579;
    private static double[] dev = {1.016, 1.128, 0.992, 1.064, 0.976, 0.984, 1.006, 1.160, 0.948, 1.110, 1.066, 0.972,
            0.926, 0.590, 0.982, 0.998, 0.886, 1.204, 1.044, 0.948};

    public GameScience20() {
        super(dev);
    }

}
