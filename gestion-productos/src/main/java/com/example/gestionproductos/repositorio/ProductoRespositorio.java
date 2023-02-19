package com.example.gestionproductos.repositorio;

import com.example.gestionproductos.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRespositorio  extends JpaRepository<Producto,Integer> {
}
