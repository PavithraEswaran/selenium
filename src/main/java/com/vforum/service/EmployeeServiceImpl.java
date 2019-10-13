package com.vforum.service;



	import java.util.List;
	 
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	import org.springframework.transaction.annotation.Transactional;

import com.vforum.dao.EmployeeDao;
import com.vforum.model.Employee;
	 
	
	 
	@Service
	@Transactional
	public class EmployeeServiceImpl implements EmployeeService {
	 
	    @Autowired
	    private EmployeeDao employeeDAO;
	 
	    @Transactional
	    public void addEmployee(Employee employee) {
	        employeeDAO.addEmployee(employee);
	    }
	 
	   
	    public List<Employee> getAllEmployees() {
	        return employeeDAO.getAllEmployees();
	    }
//	 
//	    @Transactional
//	    public void deleteEmployee(Integer employeeId) {
//	        employeeDAO.deleteEmployee(employeeId);
//	    }
	 
	    public Employee getEmployee(int empid) {
	        return employeeDAO.getEmployee(empid);
	    }
	 
//	    public Employee updateEmployee(Employee employee) {
//	        // TODO Auto-generated method stub
//	        return employeeDAO.updateEmployee(employee);
//	    }
	 
	    public void setEmployeeDAO(EmployeeDao employeeDAO) {
	        this.employeeDAO = employeeDAO;
	    
	 
	}

		

		


}