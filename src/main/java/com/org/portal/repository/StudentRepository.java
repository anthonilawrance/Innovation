package com.org.portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.portal.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
