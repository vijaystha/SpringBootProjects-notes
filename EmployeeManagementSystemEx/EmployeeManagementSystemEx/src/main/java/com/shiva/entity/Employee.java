package com.shiva.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "EMP_TBL")
@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class Employee {
	@Id
	@GeneratedValue
private int empId;
private String firstName;
private String lastName;
private String email;
private String mobile;

private String gender;
private int age;
private String nationality;
	
}
