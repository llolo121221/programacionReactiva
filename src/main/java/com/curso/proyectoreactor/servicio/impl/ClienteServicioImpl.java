package com.curso.proyectoreactor.servicio.impl;

import com.curso.proyectoreactor.entidad.Cliente;
import com.curso.proyectoreactor.repositorio.ClienteRepositorio;
import com.curso.proyectoreactor.servicio.ClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 *
 * @author neardila
 */
@Service
public class ClienteServicioImpl implements ClienteServicio {

	private final ClienteRepositorio cr;

	@Autowired
	public ClienteServicioImpl(ClienteRepositorio cr) {
		this.cr = cr;
	}

	@Override
	public Flux<Cliente> listar() {
		return cr.findAll();
	}

	@Override
	public Mono<Cliente> agregarCliente(Cliente cc) {
		Mono<Boolean> clienteExist = cr.existsByIdentificacion(cc.getIdentificacion());
		return clienteExist.flatMap(c -> { 			
			if(!c) {
				return cr.save(cc);
			}			
			return Mono.empty();
		});
	}

}
