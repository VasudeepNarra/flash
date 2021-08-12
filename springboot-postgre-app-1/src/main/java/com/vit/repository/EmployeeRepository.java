package com.vit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vit.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
