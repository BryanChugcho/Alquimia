/*package com.alquimia.rest;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alquimia.ClienteServicio.DireccionServicio;
import com.alquimia.modelo.Direccion;



	
	
	
	@RestController
	@RequestMapping ("/api/direccion")
	public class DireccionREST {

		@Autowired
		private DireccionServicio direccionServicio;
		
		@PostMapping
		private ResponseEntity<Direccion> guardar (@RequestBody Direccion direccion){
			Direccion temporal = direccionServicio.createDirecciones(direccion);
			
			try {
				return ResponseEntity.created(new URI("/api/persona" + temporal.getID_DIRECCION())).body(temporal);
				
			}catch (Exception e) {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
			}
			
		}
		
		
		@GetMapping
		private ResponseEntity<List<Direccion>> listarTodasLasPersona (){
			return ResponseEntity.ok(direccionServicio.getAllDirecciones());
		}
		
		@DeleteMapping
		private ResponseEntity <Void> eliminarDirecciones (@RequestBody Direccion direccion){
			direccionServicio.deleteDirecciones(direccion);
			return ResponseEntity.ok().build();
		}
		
		@GetMapping (value = "{id}" )
		private ResponseEntity<Optional<Direccion>> ListarDirecciones(@PathVariable("id") Long id){
			return ResponseEntity.ok(direccionServicio.findByIdDirecciones(id));
		}
		
	
	
	
	
	
	
	
	
}*/