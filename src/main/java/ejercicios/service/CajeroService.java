package ejercicios.service;

import java.util.List;

import ejercicios.dto.Cajero;

public interface CajeroService {

	List<Cajero> getCajeros();
	
	Cajero cajeroPorId(int codigo);
	
	Cajero saveCajero(Cajero cajero);
	
	Cajero updateCajero(Cajero cajero);
	
	void deleteCajero(int codigo);
}
