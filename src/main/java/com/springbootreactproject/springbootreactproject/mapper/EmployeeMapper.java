package com.springbootreactproject.springbootreactproject.mapper;

import com.springbootreactproject.springbootreactproject.entity.EmployeeEntity;
import com.springbootreactproject.springbootreactproject.model.Employee;

public class EmployeeMapper {
    //mapper class
    //instead of writing the same logic for all classes
    //we initialize controller employee then return employeeEntity
     public static Employee mapToEmployee(EmployeeEntity employeeEntity) {
        return new Employee(
                employeeEntity.getId(),
                employeeEntity.getEmail(),
                employeeEntity.getLastName(),
                employeeEntity.getFirstName()
        );
     }

    public static EmployeeEntity mapToEmployeeEntity(Employee employee) {
        return new EmployeeEntity(
                employee.getId(),
                employee.getEmail(),
                employee.getLastName(),
                employee.getFirstName()
        );
    }

}
