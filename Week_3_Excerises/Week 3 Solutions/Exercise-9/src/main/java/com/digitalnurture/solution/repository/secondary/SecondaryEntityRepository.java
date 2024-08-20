package com.digitalnurture.solution.repository.secondary;



import com.digitalnurture.solution.entity.secondary.SecondaryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SecondaryEntityRepository extends JpaRepository<SecondaryEntity, Long> {
}

