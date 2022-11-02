package com.example.certIssuer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.certIssuer.Entity.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
