package org.apoka.util.die.numeric;

/**
 * Other 10 sided dice used in some games.
 */
public class D00 extends D10 {

    @Override
    public Integer roll() {
        return super.roll()*10;
    }
}
