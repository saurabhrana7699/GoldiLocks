package com.goldilocks.Service;

import com.goldilocks.Bean.Employee;
import com.goldilocks.Exception.EmployeeException;
import com.goldilocks.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceIMPL implements EmployeeService {
    @Autowired
    private EmployeeRepo ad;

    @Override
    public Employee registerEmployee(Employee add) throws EmployeeException {

        Employee  re =  ad.save(add);

        return re;
    }

    @Override
    public List<Employee> viewAllEmployee() throws EmployeeException {

        List<Employee> vae = ad.findAll();

        if(vae == null){
            throw new EmployeeException("No Employee Registered");
        }
        else {
            return vae;
        }
    }

    @Override
    public Employee searchEmployeeByID(int id) throws EmployeeException {

        Optional<Employee> sei = ad.findById(id);

        if(sei.isEmpty()) {
            throw new EmployeeException("Id Not Found");
        }else {
            return sei.get();
        }
    }



}
