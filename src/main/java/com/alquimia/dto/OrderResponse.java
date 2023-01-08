package com.alquimia.dto;


public class OrderResponse {
	
	private String nombres_cliente;
	private String direccion;
	public OrderResponse(String nombres_cliente, String direccion) {
		this.nombres_cliente = nombres_cliente;
		this.direccion = direccion;
	}
	public String getNombres_cliente() {
		return nombres_cliente;
	}
	public void setNombres_cliente(String nombres_cliente) {
		this.nombres_cliente = nombres_cliente;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	
	
	

}
