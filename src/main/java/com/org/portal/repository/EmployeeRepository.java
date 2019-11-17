package com.org.portal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.org.portal.entities.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	@Query("SELECT e FROM Employee e")
	public List<Employee> allEmployees();
}
