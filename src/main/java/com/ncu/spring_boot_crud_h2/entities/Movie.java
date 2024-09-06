package com.ncu.spring_boot_crud_h2.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
//to rename the table in the database
@Table(name="movies")
public class Movie {
	//primary key in the db
	@Id
	@GeneratedValue()
	private int id;
	
	private String title;
	private float rating;
	private int releaseYear;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(int year) {
		this.releaseYear = year;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	
	@Override
	public String toString() {
		return "Movie [title=" + title + ", year=" + releaseYear + ", rating=" + rating + "]";
	}
	
}
