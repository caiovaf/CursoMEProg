package com.cursomeprog.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cursomeprog.crm.model.CursoModel;
import com.cursomeprog.crm.repository.CursoRepository;

@RestController
@RequestMapping("/curso")
public class CursoController {
	
	@Autowired
	private CursoRepository cursoRepository;
	
	@GetMapping
	public List<CursoModel> listar(){
		return cursoRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public CursoModel cadastrar(@RequestBody CursoModel curso) {
		return cursoRepository.save(curso);
	}
	
	@DeleteMapping
	public void apagar() {
		cursoRepository.deleteAll();
	}
	
	@PutMapping
	public CursoModel atualizar (@RequestBody CursoModel curso){
		return cursoRepository.save(curso);
	}
}
