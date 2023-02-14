package bol.com.models;

import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
public interface ASource {
    ImmutableBSource getB();

    String getS();
}
