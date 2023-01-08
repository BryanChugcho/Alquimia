package com.alquimia.repositorio;
import com.alquimia.dto.*;
import com.alquimia.repositorio.Clientedao;
import com.alquimia.modelo.Cliente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.alquimia.modelo.Cliente;


public interface ClienteRepositorio extends JpaRepository<Cliente, Long>{

	
	

	
	
      @Query("SELECT new com.alquimia.dto.OrderResponse (c.nombres_cliente , d.direccion) FROM Cliente c JOIN c.direccion d")
      public List<OrderResponse> getJoinInformation();
      
     
    	  
      }
      
    

