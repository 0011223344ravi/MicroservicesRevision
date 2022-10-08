package com.example.simplespringbootapi.service;

import com.example.simplespringbootapi.entity.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class EmpService {

    List<Employee> getAllEmployee() {

       return Stream.of(new Employee(1, "ravi"), new Employee(2, "rajan")).collect(Collectors.toList());
    }
    public Employee getEmpByID(int id){

       Employee emp  = (Employee) getAllEmployee().stream().filter(t->t.getId()==id);

      return emp;
    }
}
