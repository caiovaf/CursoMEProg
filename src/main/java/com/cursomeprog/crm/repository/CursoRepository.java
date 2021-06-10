package com.cursomeprog.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cursomeprog.crm.model.CursoModel;

@Repository
public interface CursoRepository extends JpaRepository<CursoModel, Integer>{

}
