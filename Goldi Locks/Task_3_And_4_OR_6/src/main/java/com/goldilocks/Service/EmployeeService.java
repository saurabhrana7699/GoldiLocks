package com.goldilocks.Service;

import com.goldilocks.Bean.Employee;
import com.goldilocks.Exception.EmployeeException;
;

import java.util.List;

public interface EmployeeService {

     public Employee registerEmployee(Employee add) throws EmployeeException;

    public List<Employee> viewAllEmployee()throws EmployeeException;

    public Employee searchEmployeeByID(int id)throws EmployeeException;

}
