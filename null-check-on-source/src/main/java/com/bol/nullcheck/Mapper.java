package com.bol.nullcheck;

import org.mapstruct.Mapping;

@org.mapstruct.Mapper(config = MapStructConfiguration.class)
public interface Mapper {

    @Mapping(target = "i", source = "i") // This is needed for 1.4.x - it will generate non-compiling code without.
    ATarget map(ASource value, Integer i);

    default Double map(Integer i) {
        return Double.valueOf(i);
    }
}
