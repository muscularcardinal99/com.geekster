package com.geekster.Weekly.Test3.services;

import com.geekster.Weekly.Test3.model.Job;
import com.geekster.Weekly.Test3.reposittiory.IJobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JobServices {
    @Autowired
    IJobRepository jobRepository;
    public String addJob(List<Job> jobs) {
        Iterable<Job> list = jobRepository.saveAll(jobs);
        if(list!=null){
            return "Jobs Added!!!!!!!!";
        }else{
            return "Could not add!!!!!!!!";
        }
    }

    public List<Job> getAllJobs() {
        return jobRepository.getAllJobs();
    }

    public List<Job> getAllJobsAboveSalary(Double salary) {
        return jobRepository.getAllJobsAboveSalary(salary);
    }
    public List<Job> getAllJobsSalaryGreaterThan(Double salary) {
        return jobRepository.findBySalaryGreaterThan(salary);
    }

    public void updateSalary(Double salary, Integer id) {
        jobRepository.updateSalaryById(salary,id);
    }
}
