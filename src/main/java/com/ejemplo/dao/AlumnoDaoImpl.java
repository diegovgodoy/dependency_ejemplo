package com.ejemplo.dao;

import org.springframework.stereotype.Repository;

import com.ejemplo.modelo.Alumno;

//@Repository
public class AlumnoDaoImpl  implements AlumnoDao{

	@Override
	public void insertar(Alumno alumno) {
	     // isertar en db
		System.out.println(alumno.toString());
		
	}

}
