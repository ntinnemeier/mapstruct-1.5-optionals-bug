package com.bol.generics;

import java.util.Optional;

@org.mapstruct.Mapper(config = MapStructConfiguration.class)
public interface Mapper {
    ImmutableATarget map(ImmutableASource value);

    ImmutableBTarget map(ImmutableBSource value);

    default <T> Optional<T> wrapAsOptional(T value) {
        return Optional.ofNullable(value);
    }
}
