package com.springboot.app.msproductos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.msproductos.models.entity.Producto;
import com.springboot.app.msproductos.models.service.IProductoService;

@RestController
public class ProductoController {
		
		@Autowired
		private IProductoService productoService;
		
		@GetMapping("/listar")
		public java.util.List<Producto> listar(){
			return productoService.findAll();
		}
		
		@GetMapping("/ver/{id}")
		public Producto detalle(@PathVariable Long id) {
			Producto producto = productoService.findById(id);
			return producto;
		}

}
