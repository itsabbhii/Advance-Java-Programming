package com.admin.jpah2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.admin.jpah2.model.Alien;

//public interface AlienRepo extends CrudRepository<Alien, Integer>{
//	List<Alien> findByAlang(String alang);
//	List<Alien> findByAidGreaterThan(int aid);
//	@Query("from Alien where alang=?1 order by aname")
//	List<Alien> findByAlangSorted(String alang);
//}

public interface AlienRepo extends JpaRepository<Alien, Integer>{
	
	
}