package Ejercicio_02;

public class Departamento {
	private int numeroUnidad;
	private String dni;
	private String nombrePropietario;
	private double deuda;
	
	public Departamento(int numeroUnidad) {
		this.numeroUnidad = numeroUnidad;
		this.deuda = 0;
	}

	public double actualizarDeuda(double deuda) {
		this.setDeuda(this.getDeuda() + deuda);
		return this.deuda;
	}

	@Override
	public String toString() {
		return "numeroUnidad=" + numeroUnidad + ", dni=" + dni + ", nombrePropietario="
				+ nombrePropietario + ", deuda=" + deuda;
	}

	public int getNumeroUnidad() {
		return numeroUnidad;
	}

	private void setNumeroUnidad(int numeroUnidad) {
		this.numeroUnidad = numeroUnidad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	private String getNombrePropietario() {
		return nombrePropietario;
	}

	public void setNombrePropietario(String nombrePropietario) {
		this.nombrePropietario = nombrePropietario;
	}

	public double getDeuda() {
		return deuda;
	}

	private void setDeuda(double deuda) {
		this.deuda = deuda;
	}
	
	
}
