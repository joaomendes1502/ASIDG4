package com.asidG4.parentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asidG4.parentservice.model.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {


}
