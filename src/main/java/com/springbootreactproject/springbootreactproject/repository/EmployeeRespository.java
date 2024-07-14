package com.springbootreactproject.springbootreactproject.repository;

import com.springbootreactproject.springbootreactproject.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRespository extends JpaRepository<EmployeeEntity, Long> {
}
