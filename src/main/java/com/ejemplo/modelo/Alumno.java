package com.ejemplo.modelo;

import java.time.LocalDate;

public class Alumno {
	
	private Integer id;   //int id;
	private String name;
	private LocalDate birthday;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "Alumno [id=" + id + ", name=" + name + ", birthday=" + birthday + "]";
	}
	public Alumno() {
		
	}
	
	
	

}
