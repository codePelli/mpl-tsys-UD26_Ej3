package ejercicios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ejercicios.dao.MaquinaDAO;
import ejercicios.dto.Maquina;

@Service
public class MaquinaServiceImpl implements MaquinaService{
	
	@Autowired
	private MaquinaDAO maquinaDAO;
	
	@Override
	public List<Maquina> getMaquinas() {
		// TODO Auto-generated method stub
		return maquinaDAO.findAll();
	}

	@Override
	public Maquina maquinaPorId(int codigo) {
		// TODO Auto-generated method stub
		return maquinaDAO.findById(codigo).get();
	}

	@Override
	public Maquina saveMaquina(Maquina maquina) {
		// TODO Auto-generated method stub
		return maquinaDAO.save(maquina);
	}

	@Override
	public Maquina updateMaquina(Maquina maquina) {
		// TODO Auto-generated method stub
		return maquinaDAO.save(maquina);
	}

	@Override
	public void deleteMaquina(int codigo) {
		// TODO Auto-generated method stub
		maquinaDAO.deleteById(codigo);
	}

}
