package com.info.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.info.dao.EmployeeDAO;
import com.info.model.EmployeeModel;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeDAO eDao;
	
	@RequestMapping("/getCreatePage.htm")
	public ModelAndView getRegistrationPage() {	// it would be called before getting registation form
		
		EmployeeModel eModel = new EmployeeModel();
		
		Map<String, String> genderMap = new HashMap<String, String>();
		genderMap.put("Male", "Male");
		genderMap.put("Female", "Female");
		
		ModelAndView mView = new ModelAndView();
		mView.addObject("createCommand", eModel);
		mView.addObject("gMap", genderMap);
		mView.setViewName("CreateEmployee.jsp");
		
		return mView;
	}
	
	@RequestMapping("/create.htm")		
	public ModelAndView createEmployee(EmployeeModel employee) {	// it would be called after submitting the registration form
		
		eDao.createEmployee(employee);
		
		ModelAndView mView = new ModelAndView();

		mView.setViewName("getLoginPage.htm");		
		return mView;
	}
	
	@RequestMapping("/getLoginPage.htm")
	public ModelAndView getLoginPage() {	// it would be called before getting Login form
		
		EmployeeModel eModel = new EmployeeModel();
		
		ModelAndView mView = new ModelAndView();
		mView.addObject("loginCommnad", eModel);
		mView.setViewName("Login.jsp");
		
		return mView;
	}
	
	@RequestMapping("/check.htm")
	public ModelAndView checkEmployee(EmployeeModel employee) {
		
		boolean flag = eDao.checkEmployee(employee);
		
		ModelAndView mView = new ModelAndView();
		if(flag) {
			mView.addObject("user", employee.getUsername());
			mView.setViewName("Home.jsp");
		}
		else {
			mView.addObject("message", "Invalid Credentials");			
			mView.setViewName("getLoginPage.htm");
		}
		
		return mView;
	}
	
	@RequestMapping("/getViewPage.htm")
		public ModelAndView getViewPage(){
		List<EmployeeModel> list= eDao.getAllEmployees();
        
		ModelAndView mView= new ModelAndView();
		mView.addObject("allEmployees", list);
		mView.setViewName("View.jsp");
		
		return mView;
		}
	
	@RequestMapping("/getAll.htm")		
	public ModelAndView getAllEmployees(EmployeeModel employee) {	// it would be called after submitting the registration form
		
		eDao.getAllEmployees();
		
		ModelAndView mView = new ModelAndView();

		mView.setViewName("getViewPage.htm");		
		return mView;
	}
	
	@RequestMapping("/deleteEmployee.htm")
	public ModelAndView deleteEmployee(@RequestParam("eno") EmployeeModel eno) {
		
		eDao.deleteEmployee(eno);

		ModelAndView mView= new ModelAndView();
		mView.addObject("eno", eno);
		mView.setViewName("View.jsp");
		
		return mView;
	}}
	


