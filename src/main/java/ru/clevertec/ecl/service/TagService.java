package ru.clevertec.ecl.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.clevertec.ecl.dto.TagCreateDto;
import ru.clevertec.ecl.dto.TagReadDto;
import ru.clevertec.ecl.entity.Tag;
import ru.clevertec.ecl.exception.ResourceNotFountException;
import ru.clevertec.ecl.mapper.TagMapper;
import ru.clevertec.ecl.repository.TagRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static ru.clevertec.ecl.util.Constant.ERROR_CODE;
import static ru.clevertec.ecl.util.Constant.FIELD_NAME_ID;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class TagService {

    private final TagRepository tagRepository;
    private final TagMapper tagMapper;

    public List<TagReadDto> findAll(Pageable pageable) {
        return tagRepository.findAll(pageable).stream()
                .map(tagMapper::mapToDto)
                .collect(Collectors.toList());
    }

    public TagReadDto findById(Integer id) {
        return tagRepository.findById(id)
                .map(tagMapper::mapToDto)
                .orElseThrow(() -> new ResourceNotFountException(FIELD_NAME_ID, id, ERROR_CODE));
    }

    @Transactional
    public TagReadDto save(TagCreateDto tagCreateDto) {
        return Optional.of(tagCreateDto)
                .map(tagMapper::mapToEntity)
                .map(tagRepository::save)
                .map(tagMapper::mapToDto)
                .get();
    }

    @Transactional
    public TagReadDto update(Integer id, TagCreateDto tagCreateDto) {
        return tagRepository.findById(id)
                .map(tag -> copy(tag, tagCreateDto))
                .map(tagRepository::saveAndFlush)
                .map(tagMapper::mapToDto)
                .orElseThrow(() -> new ResourceNotFountException(FIELD_NAME_ID, id, ERROR_CODE));

    }

    @Transactional
    public boolean delete(Integer id) {
        return tagRepository.findById(id)
                .map(card -> {
                    tagRepository.delete(card);
                    return true;
                })
                .orElseThrow(() -> new ResourceNotFountException(FIELD_NAME_ID, id, ERROR_CODE));
    }

    private Tag copy(Tag tag, TagCreateDto createDto) {
        if (createDto.getName() != null) {
            tag.setName(createDto.getName());
        }
        return tag;
    }

}