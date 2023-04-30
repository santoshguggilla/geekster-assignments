package com.assignment.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.demo.model.Job;
import com.assignment.demo.repository.JobRepository;

@Service
public class JobService {

	@Autowired
	private JobRepository jobRepository;

	public Iterable<Job> getAllJobDetails() {
		// TODO Auto-generated method stub
		return  jobRepository.findAll();
	}

	public String addJob(List<Job> jobList) {
		// TODO Auto-generated method stub
		Iterable<Job> list= jobRepository.saveAll(jobList);
		if(list!=null) return "Yes";
		return "No";
	}

	public List<Job> findJobOrderedBySalaryASC() {
		// TODO Auto-generated method stub
		return jobRepository.findJobOrderedBySalaryASC();
	}

	public List<Job> findJobOrderedBySalaryWithWhere(Double salary) {
		// TODO Auto-generated method stub
		return jobRepository.findJobOrderedBySalaryWithWhere(salary);
	}
	
}
