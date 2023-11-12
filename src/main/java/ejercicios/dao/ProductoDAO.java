package ejercicios.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ejercicios.dto.Producto;

public interface ProductoDAO extends JpaRepository<Producto, Integer>{

}
