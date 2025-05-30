package com.admin.SpringDemoMVC;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.admin.service.AddService;

@Controller
public class AddController {
	
	
//	public void add() {
//		System.out.println("in add");
//	}
	
//	public String add(HttpServletRequest req, HttpServletResponse res) {
//		int i = Integer.parseInt(req.getParameter("t1"));
//		int j = Integer.parseInt(req.getParameter("t2"));
//		
//		int k = i+j;
//		
//		return "display.jsp";
//	}
	
//	public ModelAndView add(HttpServletRequest req, HttpServletResponse res) {
//		int i = Integer.parseInt(req.getParameter("t1"));
//		int j = Integer.parseInt(req.getParameter("t2"));
//		
//		int k = i+j;
//		
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("display.jsp");
//		mv.addObject("result", k);
//		return mv;
//	}
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1") int i, @RequestParam("t2") int j) {//gets parameter from request i.e. index.jsp
		AddService as = new AddService();
		int k = as.add(i, j);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");
		mv.addObject("result", k);
		return mv;
	}
}
