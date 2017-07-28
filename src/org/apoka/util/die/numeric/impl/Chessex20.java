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

    public Chessex20() {
        super(20, sd, mean);
    }
}
