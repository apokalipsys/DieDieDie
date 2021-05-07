package org.apoka.util.die.symbol;

/**
 * Fudge die.
 * Implementation of a die used in role playing under the Fudge system.
 */
public class Fudge extends SymbolDie<Character> {
    public final static char PLUS = '+';
    public final static char MINUS = '-';
    public final static char BLANK = ' ';

    private final Character[] distribution = {MINUS, MINUS, BLANK, BLANK, PLUS, PLUS};

    @Override
    public Character[] getSymbols() {
        return distribution;
    }
}
