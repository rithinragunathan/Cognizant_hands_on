package com.cognizant.orm_learn.repository;

import com.cognizant.orm_learn.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRespository extends JpaRepository<Employee,Integer> {
}
