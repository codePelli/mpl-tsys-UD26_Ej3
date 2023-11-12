package ejercicios.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ejercicios.dto.Venta;

public interface VentaDAO extends JpaRepository<Venta, Integer>{


}
