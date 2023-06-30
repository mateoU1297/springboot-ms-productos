package com.springboot.app.msproductos.models.service;

import java.util.List;

import com.springboot.app.msproductos.models.entity.Producto;

public interface IProductoService {
	
	public List<Producto> findAll();
	public Producto findById(Long id);
	public Producto save(Producto producto);
	public void deleteById(Long id);
}
