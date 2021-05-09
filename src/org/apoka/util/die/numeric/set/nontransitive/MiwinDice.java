package org.apoka.util.die.numeric.set.nontransitive;

import org.apoka.util.die.numeric.Die;
import org.apoka.util.die.numeric.SimpleCustomNumberDie;

/**
 * Set of nontransitive dice invented in 1975 by the physicist Michael Winkelmann.
 */
public class MiwinDice {
    //first set
    public static final Die III = new SimpleCustomNumberDie(1, 2, 5, 6, 7, 9);
    public static final Die IV = new SimpleCustomNumberDie(1, 3, 4, 5, 8, 9);
    public static final Die V = new SimpleCustomNumberDie(2, 3, 4, 6, 7, 8);

    //second set
    public static final Die IX = new SimpleCustomNumberDie(1, 3, 5, 6, 7, 8);
    public static final Die X = new SimpleCustomNumberDie(1, 2, 4, 6, 8, 9);
    public static final Die XI = new SimpleCustomNumberDie(2, 3, 4, 5, 7, 9);

    //third set
    public static final Die MW5 = new SimpleCustomNumberDie(5, 6, 7, 8, 15, 16);
    public static final Die MW3 = new SimpleCustomNumberDie(3, 4, 11, 12, 13, 14);
    public static final Die MW1 = new SimpleCustomNumberDie(1, 2, 9, 10, 17, 18);

    //fourth set
    public static final Die MW6 = new SimpleCustomNumberDie(5, 6, 9, 10, 13, 14);
    public static final Die MW4 = new SimpleCustomNumberDie(3, 4, 7, 8, 17, 18);
    public static final Die MW2 = new SimpleCustomNumberDie(1, 2, 11, 12, 15, 16);
}
