package com.alquimia.dto;

import org.springframework.beans.factory.annotation.Autowired;

import com.alquimia.modelo.Cliente;
import com.alquimia.repositorio.Clientedao;

public class clienteServicio {

	
	@Autowired
	 private static Clientedao dao;
   
   public static Cliente update(Long id , Cliente cliente) {
 	 cliente.setId(id);
   
 	  return dao.save(cliente);
   }
	
	
	
}
