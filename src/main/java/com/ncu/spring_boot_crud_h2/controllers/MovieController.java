package com.ncu.spring_boot_crud_h2.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ncu.spring_boot_crud_h2.entities.Movie;
import com.ncu.spring_boot_crud_h2.repositories.MovieRepository;

@Controller
//@RestController is a combination of @Controller and @ResponseBody
//so if we use RestController we don't need @ResponseBody
public class MovieController {
	
//	@GetMapping("get-all-movies")
//	@ResponseBody
//	public List<String> getAllMovies(){
//		return Arrays.asList("abc","efg");
//	}
	@Autowired
	private MovieRepository repo;
	
	@GetMapping("get-all-movies")
	@ResponseBody
	public List<Movie> getAllMovies(){
//		Movie m1= new Movie();
//		m1.setTitle("abc");
//		m1.setRelaeaseYear(2020);
//		m1.setRating(4);
//		
//		Movie m2= new Movie();
//		m2.setTitle("jfj");
//		m2.setRelaeaseYear(2023);
//		m2.setRating(4.3f);
//		
//		Movie m3= new Movie();
//		m3.setTitle("ksk");
//		m3.setRelaeaseYear(2010);
//		m3.setRating(3.3f);
		
	
		return repo.findAll();
	}
	
	@GetMapping("saveInDb")
	@ResponseBody
	public Movie saveMovieInDatabase() {
		Movie m1= new Movie();
		m1.setId(1);
		m1.setTitle("abc");
		m1.setRelaeaseYear(2020);
		m1.setRating(4);
		
		return repo.save(m1);
		
	}
}
