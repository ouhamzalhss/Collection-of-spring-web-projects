package com.ouhamza.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.ouhamza.mvc.validation.CourseCode;

public class Customer {

	
	private String firstName;
	
	@NotNull(message="is requierd")
	@Size(min=1, message="is requierd")
	private String lastName;
	
	@NotNull(message="is required")
	@Max(value=10, message="must be least than 10")
	@Min(value=0, message="must be great than zero")
	private Integer freePasses;
	
	@Pattern(regexp="^[0-9A-Za-z]{5}", message="only 5 characters/digits")
	private String codePostal;
	
	@CourseCode(value="TOPS", message="must be start with TOPS")
	private String courseCode;
	
	
	
	public String getCourseCode() {
		return courseCode;
	}




	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}




	public Customer() {
		super();
	}
	



	public String getCodePostal() {
		return codePostal;
	}




	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}




	public Integer getFreePasses() {
		return freePasses;
	}




	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}




	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
