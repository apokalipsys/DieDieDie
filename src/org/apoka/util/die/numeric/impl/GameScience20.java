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

    public GameScience20() {
        super(20,sd,mean);
    }

}
