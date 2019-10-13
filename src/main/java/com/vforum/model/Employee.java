package com.vforum.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@SuppressWarnings("deprecation")
@Entity
@Table(name = "employee")
public class Employee implements Serializable {
	    private static final long serialVersionUID = -3465813074586302847L;
	    @Id
	    @Column
	    @NotNull @Min(4) @Max(11)
	    private int employeeId;
	   
		@Column
	    @Size(min=4,max=30,message="required")
	    private String employeeName;
	    @Column
	    @Size(min=5,max=30,message="required")
	    private String employeeDesignation;
	    @Column
	    @Size(min=5,max=20,message="required")
	    private String employeeLocation;
	    @Column
	    @Size(min=4,max=20,message="required")
	    private String username;
	    @Column
	    @Size(min=8,max=20,message="required")
	    private String password;
	    @OneToMany(cascade=CascadeType.ALL)
	    @JoinColumn(name="employeeId")
	    private Set<Questions> questions;
	    @OneToMany(cascade=CascadeType.ALL)
	    @JoinColumn(name="employeeId")
	    private Set<Answers> answers;
	    public Set<Answers> getAnswers() {
			return answers;
		}

		public void setAnswers(Set<Answers> answers) {
			this.answers = answers;
		}

		public Employee()
	    {
	    
	    }
	 
			 public int getEmployeeId() {
					return employeeId;
				}
		
		
				public Set<Questions> getQuestions() {
				return questions;
			}
		
			public void setQuestions(Set<Questions> questions) {
				this.questions = questions;
			}
	
			public void setEmployeeId(int employeeId) {
				this.employeeId = employeeId;
			}
	
	
			public String getEmployeeName() {
				return employeeName;
			}
	
	
			public void setEmployeeName(String employeeName) {
				this.employeeName = employeeName;
			}
	
	
			public String getEmployeeDesignation() {
				return employeeDesignation;
			}
	
	
			public void setEmployeeDesignation(String employeeDesignation) {
				this.employeeDesignation = employeeDesignation;
			}
	
	
			public String getEmployeeLocation() {
				return employeeLocation;
			}
	
	
			public void setEmployeeLocation(String employeeLocation) {
				this.employeeLocation = employeeLocation;
			}
	
	
			public String getUsername() {
				return username;
			}
	
	
			public void setUsername(String username) {
				this.username = username;
			}
	
	
			public String getPassword() {
				return password;
			}
	
	
			public void setPassword(String password) {
				this.password = password;
			}
	
	
		
		    
		}