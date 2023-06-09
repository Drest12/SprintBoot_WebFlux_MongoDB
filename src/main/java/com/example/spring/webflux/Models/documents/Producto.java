package com.example.spring.webflux.Models.documents;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="productos")
public class Producto {

    @Id
    private String Id;
    private String nombre;
    private Double precio;
    private Date createAt;
    
	public Producto() {
		
	}
	
	public Producto(String nombre, Double precio) {
	
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
    
    
    
    
}