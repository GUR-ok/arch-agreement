package ru.gur.archagreement.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gur.archagreement.entity.Agreement;

import java.util.UUID;

@Repository
public interface AgreementRepository extends JpaRepository<Agreement, UUID> {
}
