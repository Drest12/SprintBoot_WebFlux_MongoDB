package com.example.spring.webflux.Models.dao;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.example.spring.webflux.Models.documents.Producto;

public interface ProductoDao extends ReactiveMongoRepository<Producto, String> {

}