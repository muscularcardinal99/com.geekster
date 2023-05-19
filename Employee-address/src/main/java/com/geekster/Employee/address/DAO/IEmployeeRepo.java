package com.geekster.Employee.address.DAO;

import com.geekster.Employee.address.Model.Address;
import com.geekster.Employee.address.Model.Employee;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface IEmployeeRepo extends CrudRepository<Employee,Long> {
    @Query(value = "select * from employee",nativeQuery = true)
    List<Employee> getAllEmployee();
    @Query(value = "Select * from employee where id = :id ", nativeQuery = true)
    Employee getEmployee(Long id);
    @Modifying

    @Query(nativeQuery = true,value = "update employee set first_name = :firstName  where id = :id")
    void updateFirstName(String firstName, Long id);
    @Modifying
    @Query(nativeQuery = true,value = "update employee set last_name =  :lastName  where id = :id")
    void updateLastName(String lastName, Long id);
    @Modifying
    @Query(value = "update employee set address = :address where id = :id",nativeQuery = true)
    void updateEmployeeAddress(Address address, Long id);
}
