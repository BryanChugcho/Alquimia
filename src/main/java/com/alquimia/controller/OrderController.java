package com.alquimia.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.alquimia.dto.OrderRequest;
import com.alquimia.dto.OrderResponse;
import com.alquimia.dto.clienteServicio;
import com.alquimia.modelo.Cliente;
import com.alquimia.repositorio.ClienteRepositorio;
import com.alquimia.repositorio.DireccionRepositorio;

@RestController
public class OrderController {

	@Autowired
	private ClienteRepositorio clienteRepositorio ;
	
	
	
	@Autowired
	private DireccionRepositorio direccionRepositorio;
	
    @PostMapping("/placeOrder")
	public Cliente placeOrder(@RequestBody OrderRequest request) {
		return clienteRepositorio.save(request.getCliente());
		
	}
    
    
   @DeleteMapping  ("/delete/{id}")
  public void delete(@PathVariable Long id) {
	   clienteRepositorio.deleteById(id);
	   
	  
   }
    
   @PutMapping(value = "/update/{id}")
  	public Cliente update(@PathVariable("id") Long id, @RequestBody Cliente cliente  ) {
	  
	   return clienteServicio.update(id , cliente);
  		
  	}
      
   
   
   
    @GetMapping("/busqueda")
    public List<Cliente>findAllOrders(){
    	return clienteRepositorio.findAll();
    }
    
    @GetMapping("/getInfo")
    public List<OrderResponse>getJoinInfrmation(){
    	return clienteRepositorio.getJoinInformation();
    }

    
   
}
