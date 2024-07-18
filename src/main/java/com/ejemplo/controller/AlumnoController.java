package com.ejemplo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.dao.AlumnoDao;
import com.ejemplo.dao.AlumnoDaoImpl;
import com.ejemplo.modelo.Alumno;

@RestController
@RequestMapping("/alumnos")
public class AlumnoController {
	
	@Autowired
	private AlumnoDao alumnoDao;    // =new AlumnoDaoImpl();
	
	@PostMapping
	public void insertarAlumno(@RequestBody Alumno alumno) {
		alumnoDao.insertar(alumno);
		
	}

}
