package org.apoka.util.die.numeric.set;

import org.apoka.util.die.ThrowableObject;
import org.apoka.util.die.numeric.D00;
import org.apoka.util.die.numeric.D10;

/**
 * Simulate throwing two D10 to obtain a percentage.
 * Minimum value 0, maximum value 99.
 *
 * @see org.apoka.util.die.numeric.impl.Zocchihedron
 */
public class D100 implements ThrowableObject<Integer> {

    private D10 internalD10;
    private D00 internalD00;

    public D100() {
        internalD00 = new D00();
        internalD10 = new D10();
    }

    @Override
    public Integer roll() {
        return internalD00.roll()+internalD10.roll();
    }
}
