package com.bol.generics;

import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
public interface ATarget {
    Optional<ImmutableBTarget> getB();
}
