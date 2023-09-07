package com.goldilocks.Controller;

import com.goldilocks.Bean.Employee;
import com.goldilocks.Exception.EmployeeException;
import com.goldilocks.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService ad;

@PostMapping("/RegEmployee")
    public ResponseEntity<Employee> registerEmployee(@RequestBody Employee add) throws EmployeeException{

    Employee re = ad.registerEmployee(add);

    return new ResponseEntity<Employee>(re, HttpStatus.ACCEPTED);
    }


    @GetMapping("/GetAllEmployee")
    public ResponseEntity<List<Employee>> viewAllEmployee() throws  EmployeeException{

        List<Employee> vae = ad.viewAllEmployee();

    return new ResponseEntity<List<Employee>>(vae, HttpStatus.ACCEPTED);

    }


    @GetMapping("/GetEmployeeByID/{id}")
    public ResponseEntity<Employee> viewbyid(@PathVariable("id") int adms)throws EmployeeException{

        Employee byid = ad.searchEmployeeByID(adms);

        return new ResponseEntity<Employee>(byid,HttpStatus.ACCEPTED);

    }


}
