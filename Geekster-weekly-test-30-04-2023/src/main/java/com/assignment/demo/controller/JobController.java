package com.assignment.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.demo.model.Job;
import com.assignment.demo.service.JobService;

@RestController
@RequestMapping("/Job/")
public class JobController {

	@Autowired
	private JobService jobService;

	@GetMapping("/getAllJobDetails")
	public Iterable<Job> getAllJobDetails() {
		return jobService.getAllJobDetails();
	}

	@PostMapping("/addJob")
	public String addJob(@RequestBody List<Job> jobList) {
		return jobService.addJob(jobList);
	}
	@GetMapping("/getAllJobSorted")
	public List<Job> getAllJobSorted() {
		return jobService.findJobOrderedBySalaryASC();

	}
	@GetMapping("/getAllJobWhere/{salary}")
	public List<Job> getAllJobWhere(@PathVariable double salary) {
		return jobService.findJobOrderedBySalaryWithWhere(salary);

	}

}
