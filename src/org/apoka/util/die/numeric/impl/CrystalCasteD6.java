package org.apoka.util.die.numeric.impl;

import org.apoka.util.die.numeric.AbstractDistributedDie;

/**
 * Implementation of a Crystal Caste "Crystal" d6 die.
 *
 * The distribution of this implementation is according to the test made by Mark Fickett in 2015.
 */
public class CrystalCasteD6 extends AbstractDistributedDie {
    private static double[] exp = {0.7297567478,
            1.185604798,
            1.047650783,
            0.8337220926,
            1.423525492,
            0.7797400866};

    public CrystalCasteD6() {
        super(exp);
    }
}
