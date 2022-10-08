package com.example.simplespringbootapi.controller;

import com.example.simplespringbootapi.entity.Employee;
import com.example.simplespringbootapi.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    private EmpService empService  ;

    @GetMapping("/get/{id}")
    public Employee getEmployee(@PathVariable int id){

        return  empService.getEmpByID(id);
    }
}
