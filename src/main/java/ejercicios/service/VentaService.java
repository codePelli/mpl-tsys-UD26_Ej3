package ejercicios.service;

import java.util.List;
import ejercicios.dto.*;

public interface VentaService {
	
	List<Venta> getVentas();
	
	Venta ventaPorId(int id);
	
	Venta saveVenta(Venta venta);
	
	Venta updateVenta(Venta venta);
	
	Venta Venta(Venta venta);
	
	void deleteVenta(int codigo);

}
