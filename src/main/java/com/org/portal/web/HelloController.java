package com.org.portal.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.portal.entities.Student;
import com.org.portal.repository.StudentRepository;

@RestController
public class HelloController {
	@Autowired
    Environment environment;
	@Value("${server.port}")
	private String port;
	@Autowired
	private StudentRepository studentRepository;
	@GetMapping("/hello")
	public String firstBootApplication() {
		Student s = new Student();
		s.setId(123456);
		s.setName("Anthoni Lawrance");
		studentRepository.save(s);
		return "Hi Web, Environment is added "+environment.getProperty("spring.datasource.url")+" profile is "+environment.getProperty("spring.profiles.active");
	}
}
