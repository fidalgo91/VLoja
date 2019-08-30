package com.tqs.vloja.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;	
import com.tqs.vloja.classes.Utilizador;

public interface UtilizadorRepository extends CrudRepository<Utilizador, Integer> {
	Utilizador findByEmailAndPassword(String email, String password);
}

