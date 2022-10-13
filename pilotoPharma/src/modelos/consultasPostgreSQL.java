package modelos;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/** consultasPostgreSQL - Definición de las posibles consultas a ejecutar sobre la BD.
 */
public class consultasPostgreSQL {
	
	public static ArrayList<productoDTO> insertProductos(Connection conexionGenerada) {
		System.out.println("[INFORMACIÓN-consultasPostgreSQL-InsertProductos] Insertar productos");
		Statement declaracionSQL = null;
		ResultSet resultadoConsulta = null;
		ArrayList<productoDTO> listProductos = new ArrayList<>();
		
		try {
			
			//Se abre una declaración
			declaracionSQL = conexionGenerada.createStatement();
			//Se define la consulta de la declaración y se ejecuta
			resultadoConsulta = declaracionSQL.executeQuery("INSERT INTO \"dlk_operacional_productos\".opr_cat_productos(\r\n"
					+ "	mm_uuid, id_producto, cod_producto, nombre_producto, \r\n"
					+ "	tipo_producto_origen, tipo_producto_clase, des_producto, \r\n"
					+ "	VALUES (adf131029022fch12345, hig_p_gelf_f, Gel de aceite de fresa, Farlane."
					+ ", Propio, Higiene, Gel de aceite de fresa producido por marca propia Farlane.");
		    
			//Llamada a la conversión a dtoProducto
			listProductos = ADto.resultsetAdtoProducto(resultadoConsulta);
			int i = listProductos.size();
			System.out.println("[INFORMACIÓN-consultasPostgreSQL-selectREF] Productos: "+i);
			
			for(int j=0; j < listProductos.size(); j++) {
				System.out.println(listProductos.get(j).toString());
			}
			
			System.out.println("[INFORMACIÓN-consultasPostgreSQL] Cierre conexión, declaración y resultado");				
		    resultadoConsulta.close();
		    declaracionSQL.close();
		    conexionGenerada.close();
			
		} catch (SQLException e) {
			System.out.println("[ERROR-conexionPostgresql-main] Error generando la declaracionSQL: " + e);
			return listProductos;
		}
		return listProductos;
	
	}
}