package org.apoka.util.die.numeric.impl;

import org.apoka.util.die.numeric.AbstractDistributedDie;

/**
 * Implementation of a Dice Lab's d12 skew die.
 *
 * The distribution of this implementation is according to the test made by Mark Fickett in 2015.
 */
public class DiceLabSkewD12 extends AbstractDistributedDie {

    private double[] clockwise_f = {0.8584202683,
            0.8405365127,
            1.283159463,
            0.8360655738,
            0.9746646796,
            0.8494783905,
            1.251862891,
            1.180327869,
            1.323397914,
            0.9925484352,
            1.153502235,
            0.4560357675 };

    private double[] counterclockwise_f = {0.9362340585,
            0.8837209302,
            1.141785446,
            0.9857464366,
            0.9797449362,
            0.8852213053,
            1.144786197,
            1.182295574,
            1.141785446,
            0.9182295574,
            1.053263316,
            0.7471867967};

    public enum direction {
        CLOCKWISE,
        COUNTERCLOCKWISE
    }

    private DiceLabSkewD12(double[] freq) {
        super(freq);
    }

    public DiceLabSkewD12 getInstance(direction d) {
        if(d.equals(direction.CLOCKWISE)) {
            return new DiceLabSkewD12(clockwise_f);
        } else if (d.equals(direction.COUNTERCLOCKWISE)) {
            return new DiceLabSkewD12(counterclockwise_f);
        } else {
            //unsupported
            throw new UnsupportedOperationException();
        }
    }
}
