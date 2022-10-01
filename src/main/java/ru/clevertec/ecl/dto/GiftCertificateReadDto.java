package ru.clevertec.ecl.dto;


import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Value
@Builder
public class GiftCertificateReadDto {

    Integer id;

    String name;

    String description;

    BigDecimal price;

    Integer duration;

    LocalDateTime createDate;

    LocalDateTime lastUpdateDate;

    List<TagReadDto> tags;

}
