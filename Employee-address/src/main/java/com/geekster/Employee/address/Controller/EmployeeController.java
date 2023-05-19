package com.geekster.Employee.address.Controller;

import com.geekster.Employee.address.Model.Employee;
import com.geekster.Employee.address.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping(value = "/employees")
    public Iterable<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }
    @GetMapping(value = "/employees/{id}")
    public Optional<Employee> getEmployee(@PathVariable Long id){
        return employeeService.findEmployeeById(id);
    }
    @PostMapping(value = "/employees")
    public String addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployeeData(employee);
    }
    @PutMapping(value = "employees/{id}")
    public String updateEmployee(@PathVariable Long id ,@RequestBody Employee employee){
        return employeeService.updateEmployee(id,employee);
        /*
        * firstName = "";
        *
        * */
    }
    @DeleteMapping(value = "/employees/{id}")
    public String deleteEmployeeById(@PathVariable Long id){
        return employeeService.deleteEmployee(id);
    }

}

