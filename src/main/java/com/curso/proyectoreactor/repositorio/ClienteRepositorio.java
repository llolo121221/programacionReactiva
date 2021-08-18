package com.curso.proyectoreactor.repositorio;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.curso.proyectoreactor.entidad.Cliente;

import reactor.core.publisher.Mono;

/**
 *
 * @author neardila
 */
@Repository
public interface ClienteRepositorio extends ReactiveCrudRepository<Cliente, Long> {	

	public Mono<Boolean> existsByIdentificacion(String identificacion);
	
}
