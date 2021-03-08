package Ejemplos_04;

import java.util.ArrayList;

public class Agenda {
	private ArrayList<Telefono> telefonos;

	public Agenda() {
		this.telefonos = new ArrayList();
	}

	private Telefono buscar(String nombre) {
		Telefono telefono = null;
		int index = 0;
		
		while (telefono == null && index < this.telefonos.size()) {
			if (this.telefonos.get(index).getNombre().equals(nombre)) {
				telefono = this.telefonos.get(index);
			}
			index++;
		}
			
		return telefono;
	}
	/*
	private Telefono buscar(String nombre) {
		Telefono telefono = null;
		int index = 0;
		Telefono tel;
		
		while (telefono == null && index < this.telefonos.size()) {
			tel = this.telefonos.get(index);
			
			if (tel.getNombre().equals(nombre)) {
				telefono = tel;
			}
			index++;
		}
			
		return telefono;
	}
	*/
	
	public void agregar (String nombre, String numero, TipoTelefono tipo) {
		System.out.println("Agregando " + nombre);
		if (this.buscar(nombre)==null) {
			this.telefonos.add(new Telefono(nombre, numero, tipo));
			System.out.println("Agregado correctamente");
		}
		else {
			System.out.println("Nombre ya existente");
		}
	}
		
	public void mostrar() {
		for (Telefono telefono: this.telefonos) {
			System.out.println(telefono);
		}
	}
	
	public void borrar (String nombre) {
		this.telefonos.remove(this.buscar(nombre));
	}
	
	public void cambiar (String nombre, String numero, TipoTelefono tipo) {
		Telefono telefono = this.buscar(nombre);
		
		if (telefono != null) {
			telefono.setNumero(numero);
			telefono.setTipo(tipo);
		}
	}
}
