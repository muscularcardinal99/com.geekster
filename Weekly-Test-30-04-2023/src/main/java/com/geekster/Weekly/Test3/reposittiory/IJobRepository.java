package com.geekster.Weekly.Test3.reposittiory;

import com.geekster.Weekly.Test3.model.Job;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IJobRepository extends CrudRepository<Job,Integer> {
    List<Job> findBySalaryGreaterThan(Double salary);
    @Query(value = "select * from Job", nativeQuery = true)
    List<Job> getAllJobs();
    @Query(value = "select * from job where SALARY > :salary",nativeQuery = true)
    List<Job> getAllJobsAboveSalary(Double salary);

    @Modifying
    @Query(value = "update JOB set salary = :salary where id = :id",nativeQuery = true)
    void updateSalaryById(Double salary, Integer id);
}
