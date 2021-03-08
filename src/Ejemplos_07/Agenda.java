package Ejemplos_07;

import java.util.ArrayList;

public class Agenda {
	private ArrayList<Contacto> contactos;
	
	public Agenda() {
		contactos = new ArrayList();
	}
	
	private TipoTelefono getTipoTelefono(String tipo) {
		TipoTelefono tipoTelefono = TipoTelefono.CELULAR;
		switch (tipo) {
		case "Celular":
			tipoTelefono = TipoTelefono.CELULAR;
			break;
		case "Fijo":
			tipoTelefono = TipoTelefono.FIJO;
			break;
		}
		return tipoTelefono;
	}
	
	public void agregar(String nombre, String numero, String tipo) {
		System.out.println("Agregando el contacto " + nombre);
		if (this.buscar(nombre) == null) {
			this.contactos.add(new Contacto(nombre, numero, this.getTipoTelefono(tipo)));
			System.out.println("Contacto agregado");
		}
		else {
			System.out.println("El contacto " + nombre + " ya existe");
		}
	}
	
	public void mostrar() {
		for (Contacto contacto: this.contactos) {
			System.out.println(contacto);
		}
	}
	
	private Contacto buscar(String nombre) {
		Contacto contacto = null;
		int index = 0;
		Contacto contactoAux;
		while (contacto == null && index<this.contactos.size()) {
			contactoAux = this.contactos.get(index);
			if (contactoAux.getNombre().equals(nombre)) {
				contacto = contactoAux;
			}
			index++;
		}
		return contacto;
	}
	
	public void borrar(String nombre) {
		this.contactos.remove(this.buscar(nombre));
	}
	
	public void modificarNumero(String nombre, String telefono) {
		Contacto contacto = this.buscar(nombre);
		System.out.println("Modificando numero de " + nombre);
		if (contacto != null) {
			contacto.setTelefono(telefono);
			System.out.println("Contacto modificado");
		}
		else {
			System.out.println("Nombre inexistente");
		}
		
	}
}
