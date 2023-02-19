package com.example.gestionproductos.servicio;

import com.example.gestionproductos.modelo.Producto;
import com.example.gestionproductos.repositorio.ProductoRespositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServicio {

    @Autowired
    private ProductoRespositorio repositorio;

    public List<Producto> listarProductos() {
        return repositorio.findAll();

    }

    public void guardarProductos(Producto producto) {
        repositorio.save(producto);
    }

    public Producto obtenerProductoPorId(Integer id) {
        return repositorio.findById(id).get();
    }

    public void eliminarProductoPorId(Integer id) {
        repositorio.deleteById(id);
    }
}
