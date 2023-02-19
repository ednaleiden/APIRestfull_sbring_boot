package com.example.gestionproductos.controller;

import com.example.gestionproductos.modelo.Producto;
import com.example.gestionproductos.servicio.ProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductoController {

    @Autowired
    private ProductoServicio servicio;

    @GetMapping("/products")
    private List<Producto> listarProductos(){
        return servicio.listarProductos();
    }

    @GetMapping("/products/{id}")
    private Producto obtenerProducto(@PathVariable Integer id){
        return servicio.obtenerProductoPorId(id);
    }

    @PostMapping("/products")
    public void guardProducto(@RequestBody Producto producto) {
        servicio.guardarProductos(producto);
    }

    @PutMapping("/products/{id}")
    public ResponseEntity<?> actualzarProduct(@RequestBody Producto producto,@PathVariable Integer id){
        servicio.guardarProductos(producto);
        return new ResponseEntity<Producto>(producto, HttpStatus.OK);
    }

    @DeleteMapping("/products/{id}")
    public void eliminarProducto(@PathVariable Integer id){
        servicio.eliminarProductoPorId(id);
    }
}
