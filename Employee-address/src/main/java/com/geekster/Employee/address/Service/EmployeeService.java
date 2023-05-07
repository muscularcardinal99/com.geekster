package com.geekster.Employee.address.Service;

import com.geekster.Employee.address.DAO.IEmployeeRepo;
import com.geekster.Employee.address.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    IEmployeeRepo employeeRepo;
    public Iterable<Employee> getAllEmployee() {
       return employeeRepo.findAll();
    }

    public Optional<Employee> findEmployeeById(Long id) {
       return employeeRepo.findById(id);
    }

    public String addEmployeeData(Employee employee) {
        employeeRepo.save(employee);
        return "Employee Data Added!!!!!";
    }

    public String updateEmployee(Long id, Employee employee) {
        if(!employeeRepo.existsById(id)){
//            System.out.print(employee.getId()+"\n"+employee.getFirstName()+"\n"+employee.getLastName()+"\n"+employee.getAddress()+"\n"+employee.getAddress().getCity());
            return "Employee with id : "+id+" does not Exist!!!!!!!";
        }
        if(!employee.getFirstName().equals("")||employee.getFirstName()!=null) {
            employeeRepo.updateFirstName(employee.getFirstName(), id);
        }
        if (!employee.getLastName().equals("")||employee.getLastName()!=null){
            employeeRepo.updateLastName(employee.getLastName(),id);
        }
        return "Data Updated";
    }

    public String deleteEmployee(Long id) {
        if(id==null){return "Pleas enter valid ID and try Again";}
        if(!employeeRepo.existsById(id)){
            return "Employee with id : "+id+" does not Exist!!!!!!!";
        }
        employeeRepo.deleteById(id);
        return "Data deleted for employee whose id : "+id+" ,successfully!!!!!!!";
    }
}
