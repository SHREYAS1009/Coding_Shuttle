package com.codingshuttle.tutorial.dataMapping.DataMappingTutorial.controllers;

import com.codingshuttle.tutorial.dataMapping.DataMappingTutorial.entities.DepartmentEntity;
import com.codingshuttle.tutorial.dataMapping.DataMappingTutorial.entities.EmployeeEntity;
import com.codingshuttle.tutorial.dataMapping.DataMappingTutorial.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public EmployeeEntity createNewEmployee(@RequestBody EmployeeEntity employeeEntity) {
        return employeeService.createNewEmployee(employeeEntity);
    }


    @GetMapping("/{employeeId}")
    public EmployeeEntity getEmployeeById(@PathVariable Long employeeId) {
        return employeeService.getEmployeeById(employeeId);
    }





}
