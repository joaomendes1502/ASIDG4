package com.asidG4.parentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.asidG4.parentservice.model.entity.Club;

import java.util.Optional;

@Repository
public interface ClubRepository extends JpaRepository<Club, Long> {


    Optional<Club> findByName(String clubName);
}
