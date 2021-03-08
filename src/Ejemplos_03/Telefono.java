package Ejemplos_03;

public class Telefono {
	enum Tipo {
		CASA,
		TRABAJO
	}
	String numero;
	Tipo tipo;
	
	public Telefono(String numero, Tipo tipo) {
		this.numero = numero;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Telefono [numero=" + numero + ", tipo=" + tipo + "]";
	}
	
	
}
