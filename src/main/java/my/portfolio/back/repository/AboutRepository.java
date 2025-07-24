package my.portfolio.back.repository;

import my.portfolio.back.entity.AboutEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AboutRepository extends JpaRepository<AboutEntity, Integer> {
}
