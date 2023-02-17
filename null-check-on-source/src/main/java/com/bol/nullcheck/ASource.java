package com.bol.nullcheck;

import java.util.Objects;

public class ASource {
    private final String s;

    public String getS() {
        return s;
    }

    public ASource(String s) {
        this.s = s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ASource aSource = (ASource) o;
        return Objects.equals(s, aSource.s);
    }

    @Override
    public int hashCode() {
        return Objects.hash(s);
    }
}
