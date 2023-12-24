package com.example.EmployeeCRUD.controller;

import com.example.EmployeeCRUD.model.Employee;
import com.example.EmployeeCRUD.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EmployeeController {



    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping("/firstPage")
    public String firstPage(Model model){

        List<Employee> theEmployee = employeeService.findAllEmployee();
        model.addAttribute("employee",theEmployee);
        return "homepage";
    }


    @GetMapping("/addPage")
    public String showEmployee(Model model){

        Employee employee = new Employee();

        model.addAttribute("employee",employee);

        return "addPage";
    }


    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee") Employee myEmployee,Model model){
        employeeService.saveEmployee(myEmployee);
        model.addAttribute("employee",myEmployee);
        return "redirect:/firstPage";
    }



    @GetMapping("/update")
    public String updateEmployee(@RequestParam("employeeId") int id,Model model){

        Employee myEmployee = employeeService.findById(id);
        model.addAttribute("employee",myEmployee);

        return "addPage";

    }

    @GetMapping("/delete")
    public String deleteEmployee(@RequestParam("employeeId")int id){

       employeeService.deleteEmployeeById(id);

        return "redirect:/firstPage";
    }


}
