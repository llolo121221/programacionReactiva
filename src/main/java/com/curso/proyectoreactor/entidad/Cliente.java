package com.curso.proyectoreactor.entidad;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

/**
 *
 * @author neardila
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(value = "clientes")
public class Cliente {

    @Id    
    private Long id;    
    
    private String nombre;
    private String identificacion;
    
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", identificacion=" + identificacion + "]";
	}

   

}
