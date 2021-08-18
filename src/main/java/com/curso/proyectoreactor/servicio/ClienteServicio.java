package com.curso.proyectoreactor.servicio;

import com.curso.proyectoreactor.entidad.Cliente;


import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 *
 * @author neardila
 */
public interface ClienteServicio {

    public Flux<Cliente> listar();
    
    public Mono<Cliente> agregarCliente(Cliente cc);
}
