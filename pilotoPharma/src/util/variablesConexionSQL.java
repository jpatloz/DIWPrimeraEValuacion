package util;

/** variablesConexionSQL - Clase que recoger las variables de conexión a PostgreSQL.

 */
public class variablesConexionSQL {
	
	//Datos PARA LA CONEXIÓN A POSTGRESQL
	
	static final String USER = "postgres";
	static final String PASS = "Jesus2001.";
	static final String PORT = "5432";
	static final String HOST = "localhost";
	static final String DB = "Ejemploinicial";	
	
	
	//GETS
	
	public static String getUser() {
		return USER;
	}
	public static String getPass() {
		return PASS;
	}
	public static String getPort() {
		return PORT;
	}
	public static String getHost() {
		return HOST;
	}
	public static String getDb() {
		return DB;
	}
	
}
