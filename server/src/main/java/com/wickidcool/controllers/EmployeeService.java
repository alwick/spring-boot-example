package com.wickidcool.controllers;

import com.wickidcool.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeService {

    @RequestMapping(method=RequestMethod.GET)
    public List<EmployeeDTO> getEmployees() {
        List<EmployeeDTO> employees = new ArrayList<>();
        employees.add( new EmployeeDTO("Foo", "Bar", "Master of the party") );
        employees.add( new EmployeeDTO("firstName", "lastName", "title") );
        employees.add( new EmployeeDTO("Johnny", "Kringle", "Present master") );
        employees.add( new EmployeeDTO("Kris", "Bar", "Master of the party") );
        employees.add( new EmployeeDTO("Oliver", "Queen", "Bow Master") );

        return employees;
    }
}
