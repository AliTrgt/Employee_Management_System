package com.example.EmployeeCRUD.repository;

import com.example.EmployeeCRUD.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
