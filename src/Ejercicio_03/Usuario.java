package Ejercicio_03;

import java.util.ArrayList;

public class Usuario {
	private String email;
	private String apellido;
	private int edad;
	private CategoriaUsuario categoria;
	private ArrayList<Cancion> cancionesEscuchadas;
	
	public Usuario(String email, String apellido, int edad, CategoriaUsuario categoria) {
		this.email = email;
		this.apellido = apellido;
		this.edad = edad;
		this.categoria = categoria;
		this.cancionesEscuchadas = new ArrayList();
	}

	public void escuchar(Cancion cancion) {
		this.cancionesEscuchadas.add(cancion);
	}
	
	public void listarCancionesEscuchadas() {
		for (Cancion cancion: this.cancionesEscuchadas) {
			System.out.println(cancion);
		}
	}
	
	@Override
	public String toString() {
		return "Usuario [email=" + email + ", apellido=" + apellido + ", edad=" + edad + ", categoria=" + categoria
				+ " cancionesEscuchadas=" + this.cancionesEscuchadas.size() + "]";
	}
	
	public int cantidadCancionesEscuchadas() {
		return this.cancionesEscuchadas.size();
	}

	public String getEmail() {
		return email;
	}

	private void setEmail(String email) {
		this.email = email;
	}

	private String getApellido() {
		return apellido;
	}

	private void setApellido(String apellido) {
		this.apellido = apellido;
	}

	private int getEdad() {
		return edad;
	}

	private void setEdad(int edad) {
		this.edad = edad;
	}

	public CategoriaUsuario getCategoria() {
		return categoria;
	}

	private void setCategoria(CategoriaUsuario categoria) {
		this.categoria = categoria;
	}

	
	
}
