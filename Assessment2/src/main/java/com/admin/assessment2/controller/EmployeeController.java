package com.admin.assessment2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.admin.assessment2.repository.EmployeeRepo;
import com.admin.assessment2.service.Employee;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeRepo repo;
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/addEmployee")
	public String addEmployee(Employee emp) {
		repo.save(emp);
		return "success";
	}
	
	@RequestMapping("/getEmployee")
	public ModelAndView getEmployee(@RequestParam("eid") int eid) {
		ModelAndView mv = new ModelAndView("show_employee");
		Employee emp=repo.findById(eid).orElse(new Employee());
		mv.addObject("emp", emp);
		return mv;
	}
	
	@RequestMapping("/deleteEmployee")
    public String deleteEmployee(@RequestParam("eid") int eid) {
        repo.deleteById(eid);
        return "delete"; // 
    }


	@RequestMapping("/updateEmployee")
    public String updateEmployee(Employee emp) {
        repo.save(emp); 
        return "update"; 
    }
	
	

}
