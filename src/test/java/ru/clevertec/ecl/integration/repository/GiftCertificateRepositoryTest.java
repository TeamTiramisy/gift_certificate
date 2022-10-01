package ru.clevertec.ecl.integration.repository;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.transaction.annotation.Transactional;
import ru.clevertec.ecl.entity.GiftCertificate;
import ru.clevertec.ecl.integration.TestBase;
import ru.clevertec.ecl.repository.GiftCertificateRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.clevertec.ecl.util.Constant.*;

@RequiredArgsConstructor
class GiftCertificateRepositoryTest extends TestBase {

    private final GiftCertificateRepository repository;

    @Test
    void findAllByTagsNameTest() {
        Page<GiftCertificate> sport = repository.findAllByTagsName(TEST_NAME_TAG, PageRequest.of(PAGE_NUMBER, PAGE_SIZE));
        assertEquals(5, sport.getTotalElements());
    }

}