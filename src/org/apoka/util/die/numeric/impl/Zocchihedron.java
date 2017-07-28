package org.apoka.util.die.numeric.impl;

import org.apoka.util.die.numeric.AbstractDistributedDie;

/**
 * Zocchihedron is the trademark of a 100-sided die invented by Lou Zocchi, which debuted in 1985.
 *
 * This implementation generates values with the distribution described by Jason Mills in 1987,
 * where values lower than 8 and higher than 93 rarely appears.
 */
public class Zocchihedron extends AbstractDistributedDie {

    private static final double SD = 13.0;
    private static final double MEAN = 51.64;

    public Zocchihedron() {
        super(100,SD,MEAN);
    }

}
