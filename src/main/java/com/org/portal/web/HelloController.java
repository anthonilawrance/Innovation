package com.org.portal.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.org.portal.entities.Employee;
import com.org.portal.entities.Student;
import com.org.portal.repository.EmployeeRepository;
import com.org.portal.repository.StudentRepository;

@RestController
public class HelloController {
	@Autowired
    Environment environment;
	@Value("${server.port}")
	private String port;
	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private EmployeeRepository empRepository;
	@GetMapping("/hello")
	public ModelAndView firstBootApplication() {
		Student s = new Student();
		s.setId(123456);
		s.setName("Anthoni Lawrance");
		studentRepository.save(s);
		//return "Hi Web, Environment is added "+environment.getProperty("spring.datasource.url")+" profile is "+environment.getProperty("spring.profiles.active");
		ModelAndView model = new ModelAndView();
    	model.setViewName("index");
		return model;
	}
	@GetMapping("/employee")
	public List<Employee> findAllEmployees() {
		return empRepository.allEmployees();
	}
	@GetMapping("/employee/{id}")
	public String addEmployee(@PathVariable("id") final String id) {
		Employee e = new Employee();
		e.setFullName("Anthoni Lawrance");
		e.setDesignation("Sr. Consultant");
		e.setGender("MALE");
		e.setId("97983");
		System.out.println(e.getAutoGenId());
		empRepository.save(e);
		return "The id is "+id;
	}
}
