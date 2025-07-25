package my.portfolio.back.repository;


import my.portfolio.back.entity.ResultEntity;
import my.portfolio.back.enums.JobTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ResultRepository extends JpaRepository<ResultEntity, String> {
    List<ResultEntity> findByJobType(JobTypes jobType);
}
