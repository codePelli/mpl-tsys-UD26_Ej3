package ejercicios.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ejercicios.dto.Maquina;

public interface MaquinaDAO extends JpaRepository<Maquina, Integer>{

}
