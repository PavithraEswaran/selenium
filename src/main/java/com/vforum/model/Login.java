package com.vforum.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import javax.validation.constraints.Size;



public class Login {
	
	 @NotNull
    private int employeeId;
   @Size(min=5, max=15,message="required")  
    private String password;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}