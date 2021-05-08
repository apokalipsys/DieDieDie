package org.apoka.util.die.numeric.impl;

import org.apoka.util.die.numeric.AbstractDistributedDie;

/**
 * Implementation of a Wiz d20 die.
 *
 * The distribution of this implementation is according to the test made by Mark Fickett in 2015.
 */
public class Wiz20Yellow extends AbstractDistributedDie {
    private static double[] freq = {5.931356215,
            6.397867378,
            5.631456181,
            5.564811729,
            3.865378207,
            4.998333889,
            5.131622792,
            5.864711763,
            4.265244918,
            4.165278241,
            3.732089304,
            4.798400533,
            4.365211596,
            5.498167278,
            4.965011663,
            4.165278241,
            5.164945018,
            6.597800733,
            4.598467178,
            4.298567144
    };
    private static double mean = 10.23458847;

    public Wiz20Yellow() {
        super(freq);
    }
}
