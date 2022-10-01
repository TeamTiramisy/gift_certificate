package ru.clevertec.ecl.mapper;

import org.mapstruct.Mapper;
import ru.clevertec.ecl.dto.TagCreateDto;
import ru.clevertec.ecl.dto.TagReadDto;
import ru.clevertec.ecl.entity.Tag;

@Mapper(componentModel = "spring")
public interface TagMapper {

    TagReadDto mapToDto(Tag tag);

    Tag mapToEntity(TagCreateDto tag);

}
