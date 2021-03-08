package Ejemplos_04;

public class Telefono {
	private String nombre;
	private String numero;
	private TipoTelefono tipo;
	
	public Telefono(String nombre, String numero, TipoTelefono tipo) {
		this.nombre = nombre;
		this.numero = numero;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Telefono [nombre=" + nombre + ", numero=" + numero + ", tipo=" + tipo + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public TipoTelefono getTipo() {
		return tipo;
	}

	public void setTipo(TipoTelefono tipo) {
		this.tipo = tipo;
	}
	
	
	
}
