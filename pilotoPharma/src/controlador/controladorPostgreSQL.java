package controlador;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


import modelos.*;
import util.variablesConexionSQL;

/** controladorPostgreSQL - Controlador que gestiona todos los métodos de PostgreSQL

 */
public class controladorPostgreSQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//DECLARAMOS LAS CONSTANTES NECESARIAS
		final String HOST = variablesConexionSQL.getHost();
		final String PORT = variablesConexionSQL.getPort();
		final String DB = variablesConexionSQL.getDb();
		final String USER = variablesConexionSQL.getUser();
		final String PASS = variablesConexionSQL.getPass();

		
		/*Se crea una instancia de la clase en la que estamos para poder generar la conexión a PostgreSQL
		*utilizando el método generaConexion
		*/
		System.out.println("[INFORMACIÓN-controladorPortgreSQL-main] Llamada generaConexion");
		conexionPostgreSQL conexionPostgreSQL = new conexionPostgreSQL();
		Connection conexionGenerada = conexionPostgreSQL.generaConexion(HOST,PORT,DB,USER,PASS);
		
		if(conexionGenerada != null) {
			
			//Llamar al método que ejecuta la consulta
			System.out.println("[INFORMACIÓN-controladorPortgreSQL-main] Llamada insertProductos");
	
			conexionPostgreSQL = new conexionPostgreSQL();
			listProductos = consultasPostgreSQL.selectProductos(conexionGenerada);
			int i = listProductos.size();
			conexionGenerada = conexionPostgreSQL.generaConexion(HOST,PORT,DB,USER,PASS);
			listProductos = consultasPostgreSQL.insertProductos(conexionGenerada);		
			}			
	}
