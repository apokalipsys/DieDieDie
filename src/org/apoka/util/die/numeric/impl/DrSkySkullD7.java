package org.apoka.util.die.numeric.impl;

import org.apoka.util.die.numeric.AbstractDistributedDie;

/**
 * A common d7.
 * This implementation uses the distribution described by Dr. SkySkull on the blog Skulls in the Stars
 */
public class DrSkySkullD7 extends AbstractDistributedDie {

    private static double SD = 1.799642583;
    private static double MEAN = 3.958;
    private static double[] hotel = {63., 57., 72, 113, 75, 81, 39};

    public DrSkySkullD7() {
        super(hotel);
    }
}
