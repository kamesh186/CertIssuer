package com.example.certIssuer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.certIssuer.Entity.Student;
import com.example.certIssuer.Service.StudentInterface;
import com.example.certIssuer.Service.StudentService;




@RestController
@EntityScan("com.example.certIssuer.Entity")
public class StudentController {
	
	@Autowired
	private StudentInterface studentInterface;
	
	@GetMapping("/welcome")
	public String printWelcomeMessage()
	{
		return "Welcome to college";
	}
	
	@PostMapping("/AddStudent")
	public void createProfile(@RequestBody Student student)
	{
		studentInterface.createProfile(student);
	}

}
