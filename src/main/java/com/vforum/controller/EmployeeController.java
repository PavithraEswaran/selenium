package com.vforum.controller;


import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.vforum.dao.EmployeeDaoImpl;
import com.vforum.model.Answers;
import com.vforum.model.Employee;
import com.vforum.model.Login;
import com.vforum.model.Questions;
import com.vforum.service.AnswerService;
import com.vforum.service.EmployeeService;
import com.vforum.service.QuestionService;
	 
	@Controller
	@SessionAttributes("employeeId")
	public class EmployeeController {
	 
		EmployeeDaoImpl empdao;

	 
	    @Autowired
	    private EmployeeService employeeService;
	    @Autowired
	    private QuestionService questionService;
	    @Autowired
	    private AnswerService answerService;
	 
	    @RequestMapping(value = "/homePage", method = RequestMethod.GET)
	    public ModelAndView homePage(ModelAndView model,HttpSession session) {
	    	int employeeId=(Integer) session.getAttribute("employeeId");
	    	Employee employee=employeeService.getEmployee(employeeId);
		    model.addObject("employee",employee);
	    	List<Questions> allQuestions=questionService.getAllQuestions();
		    model.addObject("allQuestions",allQuestions);
		    List<Answers> allAnswers=answerService.getAllAnswers();
		    model.addObject("allAnswers",allAnswers);
		    if(employeeId==123456){
		    	model.setViewName("Admin");
		    }
		    else{
	        model.setViewName("home");
		    }
	        return model;
	    }
	 
	    @RequestMapping(value = "/newEmployee", method = RequestMethod.GET)
	    public ModelAndView register(ModelAndView model) {
	        Employee employee = new Employee();
	        model.addObject("employee", employee);
	        model.setViewName("EmployeeForm");
	        return model;
	    }
	   
	 
	    @RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
	    public ModelAndView saveEmployee(@Valid @ModelAttribute Employee employee,BindingResult br) {
	        
	        ModelAndView m=new ModelAndView();
	        if(br.hasErrors())
			   {
				   m.setViewName("EmployeeForm");
			   }
			   else {
	        if(employee!=null) {
	        employeeService.addEmployee(employee); 
	        m.addObject("employeeId",employee.getEmployeeId());
	        List<Questions> allQuestions=questionService.getAllQuestions();
	        m.addObject("allQuestions",allQuestions);
	        List<Answers> allAnswers=answerService.getAllAnswers();
	        m.addObject("allAnswers",allAnswers);
	    	m.addObject("employee", employee);
	        m.setViewName("home");
	        }
	        else
	        {
	        	 m.addObject("message", "Register with valid values");
				 m.setViewName("EmployeeForm");
	        }
			   } 
	        return m;
	        }
	    @RequestMapping(value = "/login", method = RequestMethod.GET)
	    public ModelAndView loginProcess(ModelAndView model) {
	        Login login = new Login();
	        model.addObject("login", login);
	        model.setViewName("Login");
	        return model;
	    }
	    @RequestMapping(value="/loginProcess",method = RequestMethod.POST)    
	    public ModelAndView loginEmployee(@Valid @ModelAttribute Login login,BindingResult br){
		   ModelAndView m=new ModelAndView();
		   if(br.hasErrors())
		   {
			   m.setViewName("Login");
		   }
		   else {
			   Employee employee=employeeService.getEmployee(login.getEmployeeId());
		   
		   if(employee!=null && employee.getPassword().equals(login.getPassword()) && 
				   employee.getEmployeeId()!=1) {
			    m.addObject("employeeId",login.getEmployeeId());
		        List<Questions> allQuestions=questionService.getAllQuestions();
		        m.addObject("allQuestions",allQuestions);
		        List<Answers> allAnswers=answerService.getAllAnswers();
		        m.addObject("allAnswers",allAnswers);
		    	m.addObject("employee", employee);
			    m.setViewName("home");
		 
		   }
		   else if(employee.getEmployeeId()==123456 && employee.getPassword().equals("Admin@123"))
		   {
			   m.addObject("employeeId",login.getEmployeeId());
			   List<Questions> allQuestions=questionService.getAllQuestions();
		       m.addObject("allQuestions",allQuestions);
		       List<Answers> allAnswers=answerService.getAllAnswers();
		       m.addObject("allAnswers",allAnswers);
			   m.addObject("employee",employee);
			   m.setViewName("Admin");
		   }
		   else
		   {
			   m.addObject("message", "User details wrong login again");
			   m.setViewName("Login");
		   }
		   }
		   return m;
	    }   
	 
	
	     @RequestMapping("/viewProfile")    
	    public ModelAndView viewProfile(ModelAndView model,HttpSession session){
		    int employeeId=(Integer) session.getAttribute("employeeId");
		    Employee employee=employeeService.getEmployee(employeeId);
	        model.addObject("employee",employee); 
	        
	        if(employeeId==123456 && employee.getPassword().equals("Admin@123")){
	        	List<Employee> allEmployees=employeeService.getAllEmployees();
	        	model.addObject("allEmployees", allEmployees);
	        	model.setViewName("AllProfile");
	        }
	        else{ 
		        model.setViewName("MyProfile");
	        }
	        return model;
	          
	    }    
	   @RequestMapping(value = "/logout", method = RequestMethod.GET)
	    public ModelAndView logutProcess(HttpSession session) {
		   ModelAndView model=new ModelAndView();
	        session.invalidate();
	        Login login = new Login();
	        model.addObject("login", login);
	        model.setViewName("Login");
	        return model;
	    }
	    
	    
	
}