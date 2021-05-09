package org.apoka.util.die.numeric.impl;

import org.apoka.util.die.numeric.AbstractDistributedDie;

/**
 * Implementation of an old red d20 from the 90s.
 *
 * The distribution of this implementation is according to the test made by Mark Fickett in 2015.
 */
public class MarkOldD20 extends AbstractDistributedDie {
    private static final double[] dev = {0.813264903, 0.7816818, 0.876431109, 1.089617055, 1.184366364, 1.279115673,
            0.718515594, 0.852743782, 1.176470588, 1.373864982, 1.460718516, 1.184366364, 0.876431109, 0.647453612,
            0.947493091, 1.326490328, 0.884326885, 1.0422424, 0.939597315, 0.544808527};

    public MarkOldD20() {
        super(dev);
    }
}
