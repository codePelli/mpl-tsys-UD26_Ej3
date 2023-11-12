package ejercicios.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ejercicios.dto.Cajero;

public interface CajeroDAO extends JpaRepository<Cajero, Integer>{

}
