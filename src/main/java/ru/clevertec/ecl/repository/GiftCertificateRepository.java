package ru.clevertec.ecl.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.clevertec.ecl.entity.GiftCertificate;

public interface GiftCertificateRepository extends JpaRepository<GiftCertificate, Integer> {

    @Query("select c from GiftCertificate c join c.tags t where t.name = lower(:name) ")
    Page<GiftCertificate> findAllByTagsName(String name, Pageable pageable);

}
