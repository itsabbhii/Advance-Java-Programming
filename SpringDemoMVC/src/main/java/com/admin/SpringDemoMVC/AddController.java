package com.admin.SpringDemoMVC;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
	
	@RequestMapping("/add")
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
	
	public ModelAndView add(@RequestParam("t1") int i, @RequestParam("t2") int j) {//
		
		ModelAndView mv = new ModelAndView();
		return mv;
	}
}
