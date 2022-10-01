package ru.clevertec.ecl.mapper;

import org.mapstruct.Mapper;
import ru.clevertec.ecl.dto.GiftCertificateCreateDto;
import ru.clevertec.ecl.dto.GiftCertificateFilter;
import ru.clevertec.ecl.dto.GiftCertificateReadDto;
import ru.clevertec.ecl.entity.GiftCertificate;

@Mapper(componentModel = "spring")
public interface GiftCertificateMapper {

    GiftCertificateReadDto mapToDto(GiftCertificate certificate);

    GiftCertificate mapToEntity(GiftCertificateCreateDto certificate);

    GiftCertificate mapFromFilter(GiftCertificateFilter filter);

}
