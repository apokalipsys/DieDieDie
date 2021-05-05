package org.apoka.util.die.numeric.set.nontransitive.grime;

import org.apoka.util.die.numeric.CustomNumberDie;
import org.apoka.util.die.numeric.SimpleCustomNumberDie;

/**
 * Set of 5 intransitive dice discovered by Dr. James Grime
 */
public class GrimeDice {
    public static final CustomNumberDie RED = new SimpleCustomNumberDie(4,4,4,4,4,9);
    public static final CustomNumberDie YELLOW = new SimpleCustomNumberDie(3,3,3,3,8,8);
    public static final CustomNumberDie BLUE = new SimpleCustomNumberDie(2,2,2,7,7,7);
    public static final CustomNumberDie MAGENTA = new SimpleCustomNumberDie(1,1,6,6,6,6);
    public static final CustomNumberDie OLIVE = new SimpleCustomNumberDie(0,5,5,5,5,5);
}
