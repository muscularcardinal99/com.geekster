package com.geekster.Weekly.Test3.comtroller;

import com.geekster.Weekly.Test3.model.Job;
import com.geekster.Weekly.Test3.services.JobServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/job")
public class JobController {
    @Autowired
    JobServices jobServices;

    @PostMapping(value = "/addJob")
    public String addJob(@RequestBody List<Job> jobs){
        return jobServices.addJob(jobs);
    }
    @GetMapping(value = "/getAllJobs")
    public List<Job> getAllJobs(){
        return jobServices.getAllJobs();
    }
    @GetMapping(value = "/salary/{salary}")
    public List<Job> getAllJobsAboveSalary(@PathVariable Double salary){
        return jobServices.getAllJobsAboveSalary(salary);
    }
    @PutMapping(value = "/salary/{salary}/id/{id}")
    public void updateSalary(@PathVariable  Double salary,@PathVariable Integer id){
        jobServices.updateSalary(salary,id);
    }
    @GetMapping(value = "/getBySalaryAbove/{salary}")
    public List<Job> getBySalaryAbove(@PathVariable Double salary){
        return jobServices.getAllJobsSalaryGreaterThan(salary);
    }
}
