package org.apoka.util.die.numeric;

import java.util.concurrent.ThreadLocalRandom;

/**
 * This is a template for a "real" dice.
 * The behavior of this dice is defined by a Gaussian distribution
 */
public abstract class AbstractGaussianDie extends Die {

    private double mean;
    private double std;

    /**
     * Constructor for a die with a number of sides, with a standard deviation and a mean.
     * @param sides number of sides of this die
     * @param std standard deviation for this die
     * @param mean the mean of values returned by this die
     */
    public AbstractGaussianDie(int sides, double std, double mean) {
        super(sides);
        this.std = std;
        this.mean = mean;
    }

    @Override
    public Integer roll() {
        int aGaussian;

        do {
            aGaussian = (int) (ThreadLocalRandom.current().nextGaussian() * std + mean);
        } while (minimum > aGaussian || aGaussian > sides);

        return aGaussian;
    }
}
