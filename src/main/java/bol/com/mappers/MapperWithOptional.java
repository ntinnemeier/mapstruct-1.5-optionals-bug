package bol.com.mappers;

import bol.com.models.ASource;
import bol.com.models.ATarget;
import bol.com.models.BSource;
import bol.com.models.BTarget;
import bol.com.models.ImmutableASource;
import bol.com.models.ImmutableATarget;
import bol.com.models.ImmutableBSource;
import bol.com.models.ImmutableBTarget;
import org.mapstruct.Mapper;

import java.util.Optional;

@Mapper(config = MapStructConfiguration.class)
public interface MapperWithOptional {
    ImmutableATarget map(ImmutableASource value);

    ImmutableBTarget map(ImmutableBSource value);

    default <T> Optional<T> wrapAsOptional(T value) {
        return Optional.ofNullable(value);
    }
}
