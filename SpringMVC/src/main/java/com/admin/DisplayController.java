package com.admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DisplayController {
	@RequestMapping("/display")
	public ModelAndView display(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		String name = req.getParameter("name");
		String dept = req.getParameter("dept");
		long mob = Long.parseLong(req.getParameter("mob"));
		mv.setViewName("welcome.jsp");
		mv.addObject("name", name);
		mv.addObject("dept", dept);
		mv.addObject("mob", mob);
		return mv;
	}
}
