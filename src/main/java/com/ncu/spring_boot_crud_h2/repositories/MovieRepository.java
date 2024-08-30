package com.ncu.spring_boot_crud_h2.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ncu.spring_boot_crud_h2.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Movie> {
	
	
}


//this is a reuseable class cause its generic, but its given by spring boot
//public class CustomRepository<T> {
//	
//	void delete(int id) {
//		
//	}
//	
//	void update(T m) {
//		
//	}
//	
//	void save(T m) {
//		
//	}
//	
//	List<Movie> findAll(){
//		
//		return null;
//	}
//}

