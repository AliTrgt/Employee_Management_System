package com.example.EmployeeCRUD.service;

import com.example.EmployeeCRUD.model.Employee;
import com.example.EmployeeCRUD.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }



    public List<Employee> findAllEmployee(){
        return employeeRepository.findAll();
    }

    public Employee findById(int id){
         return employeeRepository.findById(id).orElse(null);
    }

    public void saveEmployee(Employee employee){
         employeeRepository.save(employee);
    }

    public void deleteEmployeeById(int id){
        employeeRepository.deleteById(id);
    }



}
