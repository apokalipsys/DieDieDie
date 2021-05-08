package org.apoka.util.die.numeric.impl;

import org.apoka.util.die.numeric.AbstractDistributedDie;

/**
 * Implementation of a Crystal Caste d20 die.
 *
 * The distribution of this implementation is according to the test made by Mark Fickett in 2015.
 */
public class CrystalCaste20ClearBlack extends AbstractDistributedDie {
    private static double[] exp = {1.499500167,
            1.399533489,
            0.9196934355,
            0.7797400866,
            0.8397200933,
            0.8463845385,
            1.386204598,
            1.559480173,
            0.7397534155,
            0.5998000666,
            0.7264245252,
            1.019660113,
            0.9996667777,
            1.172942353,
            0.6731089637,
            0.6731089637,
            0.4731756081,
            0.8263912029,
            1.392869044,
            1.472842386};

    public CrystalCaste20ClearBlack() {
        super(exp);
    }
}
