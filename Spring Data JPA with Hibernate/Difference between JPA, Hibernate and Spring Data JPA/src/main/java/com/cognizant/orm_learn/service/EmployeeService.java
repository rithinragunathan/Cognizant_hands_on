package com.cognizant.orm_learn.service;

import com.cognizant.orm_learn.dao.EmployeeDAO;
import com.cognizant.orm_learn.entity.Employee;
import com.cognizant.orm_learn.repository.EmployeeRespository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeService {
    private final EmployeeRespository employeeRepository;
    private final EmployeeDAO employeeDAO;
    public EmployeeService(EmployeeRespository employeeRepository, EmployeeDAO employeeDAO) {
        this.employeeRepository = employeeRepository;
        this.employeeDAO = employeeDAO;
    }

    @Transactional
    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
        employeeDAO.addEmployee(employee);
    }
}
