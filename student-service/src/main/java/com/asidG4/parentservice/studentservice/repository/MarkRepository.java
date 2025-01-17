package com.asidG4.parentservice.studentservice.repository;

import com.asidG4.parentservice.studentservice.model.entity.Mark;
import com.asidG4.parentservice.studentservice.model.entity.enums.MarkEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarkRepository extends JpaRepository<Mark, Long> {

    Mark findByMark(MarkEnum mark);
}
