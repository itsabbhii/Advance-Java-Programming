package com.admin.webSB;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("home")
	public ModelAndView home(Alien alien) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		mv.addObject("ob", alien);
		return mv;
	}
}
