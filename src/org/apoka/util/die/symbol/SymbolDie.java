package org.apoka.util.die.symbol;

import org.apoka.util.die.ThrowableObject;
import org.apoka.util.die.numeric.Die;

public abstract class SymbolDie<T> implements ThrowableObject<T> {

    public T roll() {
        int roll = new Die(getSymbols().length).roll();

        return getSymbols()[roll-1];
    }

    public abstract T[] getSymbols();
}
