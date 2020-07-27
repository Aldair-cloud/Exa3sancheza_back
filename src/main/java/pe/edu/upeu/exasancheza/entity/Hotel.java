package pe.edu.upeu.exasancheza.entity;

public class Hotel {
	private int idCliente;
	private int documento;
	private String nombre;
	private String fechaNacimiento;
	private String lugarNacimiento;
	private String sexo;
	private String observacion;
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hotel(int idCliente, int documento, String nombre, String fechaNacimiento, String lugarNacimiento,
			String sexo, String observacion) {
		super();
		this.idCliente = idCliente;
		this.documento = documento;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.lugarNacimiento = lugarNacimiento;
		this.sexo = sexo;
		this.observacion = observacion;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public int getDocumento() {
		return documento;
	}
	public void setDocumento(int documento) {
		this.documento = documento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getLugarNacimiento() {
		return lugarNacimiento;
	}
	public void setLugarNacimiento(String lugarNacimiento) {
		this.lugarNacimiento = lugarNacimiento;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	
	
}
