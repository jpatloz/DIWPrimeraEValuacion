package modelos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/** dtoADto - Métodos para convertir el producto en DTO
 */
public class ADto {
	
	public static int resultsetADtoProducto(ResultSet resultadoConsulta){
		
		System.out.println("[INFORMACIÓN-resultsetAdtoProducto] Entrando en resultsetAdtoProducto");
		ArrayList<productoDTO> listProductos = new ArrayList<>();
		
		//Añadimos todas las filas
		try {
			while (resultadoConsulta.next() ) {
				listProductos.add(new productoDTO(resultadoConsulta.getString("mm_uuid"),
						resultadoConsulta.getInt("id_producto"),
						resultadoConsulta.getString("cod_producto"),
						resultadoConsulta.getString("nombre_producto"),
						resultadoConsulta.getString("tipo_producto_origen"),
						resultadoConsulta.getString("tipo_producto_clase"),
						resultadoConsulta.getString("des_producto")
						);
			}
			int i = listProductos.size();
			System.out.println("[INFORMACIÓN-resultsetAdtoProducto] Productos: "+i);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listProductos;
		
	}

}