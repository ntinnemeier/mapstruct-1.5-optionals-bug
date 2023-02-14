package bol.com.models;

import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
public interface ATarget {
    Optional<ImmutableBTarget> getB();

    Optional<String> getS();
}
