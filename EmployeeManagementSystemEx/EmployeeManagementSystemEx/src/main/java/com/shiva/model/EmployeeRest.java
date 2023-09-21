package com.shiva.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor(staticName = "build")
public class EmployeeRest {
    @NotNull(message = "username shouldn't be null")

	private String firstName;
private String lastName;
@Email(message = "invalid email address")

private String email;
@Pattern(regexp = "^\\d{10}$",message = "invalid mobile number entered ")
private String mobile;
private String gender;
@Min(18)
@Max(60) 	
private int age;
private String nationality;
	

}
