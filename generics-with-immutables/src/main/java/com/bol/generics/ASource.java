package com.bol.generics;

import org.immutables.value.Value;

@Value.Immutable
public interface ASource {
    ImmutableBSource getB();
}
