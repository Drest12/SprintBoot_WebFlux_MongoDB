package com.example.spring.webflux;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.spring.webflux.Models.dao.ProductoDao;
import com.example.spring.webflux.Models.documents.Producto;

import reactor.core.publisher.Flux;

@SpringBootApplication
public class SpringBootWebfluxApplication implements CommandLineRunner {

	@Autowired
	private ProductoDao dao;
	private static final Logger Log = LoggerFactory.getLogger(SpringBootWebfluxApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebfluxApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Flux.just(new Producto("TV Panasonic LCD",2500.0),
				  new Producto("Sony Camara HD Digital",900.0),
				  new Producto("Apple Laptop",3900.0),
				  new Producto("TV Notebook",1789.0),
				  new Producto("Audifonos Bluetooh",60.0),
				  new Producto("HD Externo",250.0)
				  )
		.flatMap(producto-> dao.save(producto))
		.subscribe(producto -> Log.info("Insert: "+producto.getId()+" "+producto.getNombre()));
	}

}
