package com.springboot.app.msproductos.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.app.mscommons.models.entity.Producto;

public interface ProductoDao extends CrudRepository<Producto, Long> {

}
