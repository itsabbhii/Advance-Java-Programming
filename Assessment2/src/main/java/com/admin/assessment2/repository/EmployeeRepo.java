package com.admin.assessment2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.admin.assessment2.service.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Integer>{
	List<Employee> findByEid(int eid);
	
}
