package ejercicios.service;

import java.util.List;

import ejercicios.dto.Maquina;

public interface MaquinaService {

	List<Maquina> getMaquinas();
	
	Maquina maquinaPorId(int codigo);
	
	Maquina saveMaquina(Maquina maquina);
	
	Maquina updateMaquina(Maquina maquina);
	
	void deleteMaquina(int codigo);
}
