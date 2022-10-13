/**
 * 
 */
package modelos;

/** dtoAlumno - DTO de la entidad productos de la BBDD de PostgreSQL
 */
public class productoDTO {
	
	//Constructor completo
	public productoDTO(String mm_uuid, String md_fch, int id_producto, String cod_producto,
			String nombre_producto, String tipo_producto_origen, String tipo_producto_clase,
			String des_producto, String fch_alta_producto, String fch_baja_producto) {
		
	}
	
	//ATRIBUTOS	
	
	String mm_uuid;
	int id_producto;
	String cod_producto;
	String nombre_producto;
	String tipo_producto_origen;
	String tipo_producto_clase;
	String des_producto;
	
	
	//GETTERS AND SETTERS
	
	public String getMm_uuid() {
		return mm_uuid;
	}
	public void setMm_uuid(String mm_uuid) {
		this.mm_uuid = mm_uuid;
	}
	public int getId_producto() {
		return id_producto;
	}
	public int setId_producto(String id_producto) {
		this.id_producto = id_producto;
	}
	public String getCod_producto() {
		return cod_producto;
	}
	public void setCod_producto(String cod_producto) {
		this.cod_producto = cod_producto;
	}
	public String getNombre_producto() {
		return nombre_producto;
	}
	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}
	public String getTipo_producto_origen() {
		return tipo_producto_origen;
	}
	public void setTipo_producto_origen(String tipo_producto_origen) {
		this.tipo_producto_origen = tipo_producto_origen;
	}
	public String getTipo_producto_clase() {
		return tipo_producto_clase;
	}
	public void setTipo_producto_clase(String tipo_producto_clase) {
		this.tipo_producto_clase = tipo_producto_clase;
	}
	public String getDes_producto() {
		return des_producto;
	}
	public void setDes_producto(String des_producto) {
		this.des_producto = des_producto;
	}

}