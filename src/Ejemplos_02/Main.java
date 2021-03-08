package Ejemplos_02;

import java.util.ArrayList;

public class Main {

	public static ArrayList<Persona> personas;
	
	public static Persona buscar(String nombre) {
		Persona persona = null;
		int index = 0;
		
		while (persona == null && index < personas.size()) {
			if (personas.get(index).nombre.equals(nombre)) {
				persona = personas.get(index);
			}
			index++;
		}
		return persona;
	}
	
	public static void agregar (String nombre, int edad) {
		if (buscar(nombre)==null) {
			personas.add(new Persona(nombre, edad));
		}
	}
	
	public static void main(String[] args) {
		personas = new ArrayList();
		
		agregar("Diego", 25);
		agregar("Juan", 35);
		agregar("Diego", 25);
		agregar("Pablo", 10);
		
		/*
		for (int i=0; i< personas.size(); i++) {
			System.out.println(personas.get(i));
		}
		*/
		
		personas.remove(0);
		personas.remove(buscar("Juan"));
		
		for (Persona persona: personas) {
			System.out.println(persona);
		}
	}

}
