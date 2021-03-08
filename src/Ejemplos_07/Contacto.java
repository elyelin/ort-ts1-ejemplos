package Ejemplos_07;

public class Contacto {
	private String nombre;
	private String telefono;
	private TipoTelefono tipo;

	public Contacto(String nombre, String telefono, TipoTelefono tipo) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "nombre=" + nombre + ", telefono=" + telefono + ", tipo=" + tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
}
