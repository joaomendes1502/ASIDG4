package com.asidg4.parentservice.repository;

import com.asidg4.parentservice.model.entity.Parent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ParentRepository extends JpaRepository<Parent, Long> {

    Optional<Parent> findByEmail(String email);

}
