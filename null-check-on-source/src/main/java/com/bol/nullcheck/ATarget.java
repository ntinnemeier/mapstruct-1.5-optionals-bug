package com.bol.nullcheck;

import java.util.Objects;

public class ATarget {
    private final String s;

    public String getS() {
        return s;
    }
    private final Integer i;

    public Integer getI() {
        return i;
    }

    public ATarget(String s, Integer i) {
        this.s = s;
        this.i = i;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ATarget aTarget = (ATarget) o;
        return Objects.equals(s, aTarget.s) && Objects.equals(i, aTarget.i);
    }

    @Override
    public int hashCode() {
        return Objects.hash(s, i);
    }
}
