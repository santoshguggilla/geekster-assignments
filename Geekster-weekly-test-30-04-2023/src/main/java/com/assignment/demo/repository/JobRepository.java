package com.assignment.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.assignment.demo.model.Job;
@Repository
public interface JobRepository extends CrudRepository<Job, Long>{

	

	List<Job> findJobOrderedBySalaryASC();

	List<Job> findJobOrderedBySalaryWithWhere(Double salary);

	

}
