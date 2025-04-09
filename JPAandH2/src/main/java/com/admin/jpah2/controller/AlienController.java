package com.admin.jpah2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.admin.jpah2.dao.AlienRepo;
import com.admin.jpah2.model.Alien;

@RestController
public class AlienController {
	@Autowired
	AlienRepo repo;
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
//	@RequestMapping("/addAlien")
//	public String addAlien(Alien alien) {
//		repo.save(alien);
//		return "home";
//	}
	
	@PostMapping("/alien")
	@ResponseBody
	public Alien addAlien(@RequestBody Alien alien) {
		repo.save(alien);
		return alien;
	}
	
	@RequestMapping("/getAlien")
	public ModelAndView addAlien(@RequestParam int aid) {
		ModelAndView mv = new ModelAndView("show_alien");
		Alien alien=repo.findById(aid).orElse(new Alien());
//		System.out.println(repo.findByAidGreaterThan(102));
//		System.out.println(repo.findByAlang("English"));
//		System.out.println(repo.findByAlangSorted("English"));
		mv.addObject(alien);
		return mv;
	}
	
	@RequestMapping("/aliens")
	@ResponseBody
	public List<Alien> getAliens(){
		return repo.findAll();
	}
	
	@RequestMapping("/aliens/{aid}")
	@ResponseBody
	public Optional<Alien> getAlien(@PathVariable("aid") int aid){
		return repo.findById(aid);
	}
	
}
