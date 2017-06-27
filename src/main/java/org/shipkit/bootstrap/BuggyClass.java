package org.shipkit.bootstrap;

import java.util.Random;

public class BuggyClass {

    private int number;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BuggyClass)) return false;

        BuggyClass that = (BuggyClass) o;

        return number == that.number;

    }

    @Override
    public int hashCode() {
        return number;
    }
}
