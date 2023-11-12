package ejercicios.service;

import java.util.List;

import ejercicios.dto.Maquina;
import ejercicios.dto.Producto;

public interface ProductoService {
	
	List<Producto> getProductos();
	
	Producto productoPorId(int codigoCajero);
	
	Producto saveProducto(Producto producto);
	
	Producto updateProducto(Producto producto);
	
	void deleteProducto(int codigoCajero);

}
