package com.springbootreactproject.springbootreactproject.service.impl;

import com.springbootreactproject.springbootreactproject.entity.EmployeeEntity;
import com.springbootreactproject.springbootreactproject.mapper.EmployeeMapper;
import com.springbootreactproject.springbootreactproject.model.Employee;
import com.springbootreactproject.springbootreactproject.repository.EmployeeRespository;
import com.springbootreactproject.springbootreactproject.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeRespository employeeRepository;

    @Override
    public Employee createEmployee(Employee employee){
        //so from entity so from database you map to employee
        //as we create an employee we get from the frontend and pass it to employeeEntity
        //we are comverting from model to entity
        EmployeeEntity employeeEntity = EmployeeMapper.mapToEmployeeEntity(employee);
        EmployeeEntity savedEmployee = employeeRepository.save(employeeEntity);
        return EmployeeMapper.mapToEmployee(savedEmployee);
    }
}
