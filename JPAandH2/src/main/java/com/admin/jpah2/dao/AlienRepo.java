package com.admin.jpah2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.admin.jpah2.model.Alien;

public interface AlienRepo extends CrudRepository<Alien, Integer>{
	List<Alien> findByAlang(String alang);
	List<Alien> findByAidGreaterThan(int aid);
	@Query("from Alien where alang=?1 order by aname")
	List<Alien> findByAlangSorted(String alang);
}
