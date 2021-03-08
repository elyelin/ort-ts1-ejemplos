package Ejercicio_02;

import java.util.ArrayList;

public class Edificio {
	private String direccion;
	private int cantidadDepartamentos;
	private ArrayList<Departamento> departamentos;
	private ArrayList<Departamento> morosos;
	
	public Edificio (String direccion, int cantidadDepartamentos) {
		departamentos = new ArrayList();
		morosos = new ArrayList();
		this.direccion = direccion;
		this.cantidadDepartamentos = cantidadDepartamentos;
		this.inicializarDepartamentos();
	}
	
	private void inicializarDepartamentos() {
		for (int i=0; i<this.getCantidadDepartamentos(); i++) {
			this.departamentos.add(new Departamento(i+1));
		}
	}
	
	public void listarUnidades() {
		this.listar(this.departamentos);
	}

	public void listarMorosos() {
		this.listar(this.morosos);
	}
	
	private void listar(ArrayList<Departamento> deptos) {
		for (Departamento departamento: deptos) {
			System.out.println(departamento);
		}
	}
	
	private boolean validarNumeroUnidad(int numeroUnidad) {
		return numeroUnidad >0 && numeroUnidad<= this.getCantidadDepartamentos();
	}
	
	private boolean validarUnidadVacia(int numeroUnidad) {
		return this.departamentos.get(numeroUnidad-1).getDni() == null;
	}
	
	public void habitarUnidad(int numeroUnidad, String dni, String nombrePropietario) {
		Departamento departamento;
		if (this.validarNumeroUnidad(numeroUnidad) && this.validarUnidadVacia(numeroUnidad)) {
			departamento = this.departamentos.get(numeroUnidad-1);
			departamento.setDni(dni);
			departamento.setNombrePropietario(nombrePropietario);
		}
	}
	
	public void agregarDeuda (int numeroUnidad, double deuda) {
		if (this.validarNumeroUnidad(numeroUnidad) && !this.validarUnidadVacia(numeroUnidad) && deuda > 0) {
			Departamento departamento = this.departamentos.get(numeroUnidad-1);
			if (departamento.actualizarDeuda(deuda) >0 && 
					!this.validarMorosoEnListMorosos(numeroUnidad)) {
				this.morosos.add(departamento);
			}
		}
	}
	
	private boolean validarMorosoEnListMorosos(int numeroUnidad) {
		boolean morosoExistente = false;
		int index = 0;
		while (!morosoExistente && index<this.morosos.size()) {
			if (this.morosos.get(index).getNumeroUnidad() == numeroUnidad) {
				morosoExistente = true;
			}
			index ++;
		}
		return morosoExistente;
	}
	
	private Departamento buscarMoroso(int numeroUnidad) {
		Departamento departamento = null;
		int index = 0;
		while (departamento == null && index < this.morosos.size()) {
			if (this.morosos.get(index).getNumeroUnidad() == numeroUnidad) {
				departamento = this.morosos.get(index);
			}
			index++;
		}
		return departamento;
	}
	
	public void cancelarDeuda(int numeroUnidad, double importe) {
		Departamento departamento = this.buscarMoroso(numeroUnidad);
		if (departamento != null && importe > 0) {
			departamento.actualizarDeuda(importe * -1);
			if (departamento.getDeuda()<=0) {
				this.morosos.remove(departamento);
			}
		}
	}
 	
	private String getDireccion() {
		return direccion;
	}

	private void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	private int getCantidadDepartamentos() {
		return cantidadDepartamentos;
	}

	private void setCantidadDepartamentos(int cantidadDepartamentos) {
		this.cantidadDepartamentos = cantidadDepartamentos;
	}
	
	
}
