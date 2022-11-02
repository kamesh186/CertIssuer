package com.example.certIssuer.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.certIssuer.StudentRepository;
import com.example.certIssuer.Entity.Student;

@Service
public class StudentService implements StudentInterface {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public void createProfile(Student student)
	{
		studentRepository.save(student);//done
		
	}

}
