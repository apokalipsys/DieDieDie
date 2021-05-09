package org.apoka.util.die.numeric;

import java.util.concurrent.ThreadLocalRandom;

/**
 * This is a template for a "real" dice.
 * The behavior of this dice is defined by an array of probabilities.
 */
public abstract class AbstractDistributedDie extends Die {
    double[] freq;
    double[] prefix;

    public AbstractDistributedDie(double[] probabilities) {
        super(probabilities.length);

        freq = probabilities;

        fillPrefix();
    }

    private void fillPrefix() {
        prefix = new double[freq.length];
        prefix[0] = freq[0];

        for (int i = 1; i < freq.length; i++) {
            prefix[i] = prefix[i-1] + freq[i];
        }
    }

    public Integer roll() {
        int n = freq.length;
        double rand = ThreadLocalRandom.current().nextDouble(0.0, prefix[n-1]);

        return findCeil(prefix, rand, 0, n - 1) + 1;
    }

    private int findCeil(double arr[], double r, int l, int h) {
        int mid;
        while (l < h) {
            mid = l + ((h - l) >> 1); // Same as mid = (l+h)/2
            if(r > arr[mid])
                l = mid + 1;
            else
                h = mid;
        }
        return (arr[l] >= r) ? l : -1;
    }
}
