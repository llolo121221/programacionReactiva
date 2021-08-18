package com.curso.proyectoreactor.controlador;

import com.curso.proyectoreactor.entidad.Cliente;
import com.curso.proyectoreactor.servicio.ClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "clientes")
public class ClienteControlador {

    private final ClienteServicio cs;

    @Autowired
    public ClienteControlador(ClienteServicio cs) {
        this.cs = cs;
    }

    @GetMapping()
    public Flux<Cliente> listar() {
        return cs.listar();
    }
    
    @PostMapping
    public Mono<Cliente> insertarCliente(@RequestBody Cliente cc){
    	return cs.agregarCliente(cc);
    }

}
