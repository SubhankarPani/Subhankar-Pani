package com.digitalnurture.solution.repository.primary;


import com.digitalnurture.solution.entity.primary.PrimaryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrimaryEntityRepository extends JpaRepository<PrimaryEntity, Long> {
}
