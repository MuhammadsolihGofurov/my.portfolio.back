package my.portfolio.back.repository;

import my.portfolio.back.entity.AboutEntity;
import my.portfolio.back.enums.JobTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AboutRepository extends JpaRepository<AboutEntity, Integer> {
    Optional<AboutEntity> findByJobType(JobTypes jobType);
}
