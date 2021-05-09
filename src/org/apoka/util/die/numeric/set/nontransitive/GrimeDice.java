package org.apoka.util.die.numeric.set.nontransitive;

import org.apoka.util.die.numeric.Die;
import org.apoka.util.die.numeric.SimpleCustomNumberDie;

/**
 * Set of 5 intransitive dice discovered by Dr. James Grime
 */
public class GrimeDice {
    public static final Die RED = new SimpleCustomNumberDie(4,4,4,4,4,9);
    public static final Die YELLOW = new SimpleCustomNumberDie(3,3,3,3,8,8);
    public static final Die BLUE = new SimpleCustomNumberDie(2,2,2,7,7,7);
    public static final Die MAGENTA = new SimpleCustomNumberDie(1,1,6,6,6,6);
    public static final Die OLIVE = new SimpleCustomNumberDie(0,5,5,5,5,5);
}
