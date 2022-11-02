package com.example.certIssuer.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GeneratorType;

import lombok.Data;

@Entity
public  @Data class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int reg_no;
	private String name;
	private String dept;
	private Date dob;

}
