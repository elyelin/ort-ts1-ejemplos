package Ejercicio_03;

import java.util.ArrayList;

public class Aplicacion {
	private static int MAXIMAS_CANCIONES_GRATUITAS = 50;
	
	private ArrayList<Cancion> canciones;
	private ArrayList<Usuario> usuarios;
	
	public Aplicacion() {
		this.canciones = new ArrayList();
		this.usuarios = new ArrayList();
	}
	
	public boolean altaCancion(String nombre, String autor, String genero, int diasPublicacion) {
		boolean altaExitosa = false;
		if (this.buscarCancion(nombre, autor) == null) {
			this.canciones.add(new Cancion(nombre, autor, genero, diasPublicacion));
			altaExitosa = true;
		}
		return altaExitosa;
	}
	
	public void listarCanciones() {
		for (Cancion cancion: this.canciones) {
			System.out.println(cancion);
		}
	}
	
	private Cancion buscarCancion(String nombre, String autor) {
		Cancion cancion = null;
		int index = 0;
		while (cancion == null && index < this.canciones.size()) {
			Cancion cancionAux = this.canciones.get(index);
			if (cancionAux.getNombre().equals(nombre) && cancionAux.getAutor().equals(autor)) {
				cancion = cancionAux;
			}
			index++;
		}
		return cancion;
	}
	
	private Usuario buscarUsuario(String email) {
		Usuario usuario = null;
		int index = 0;
		
		while (usuario == null && index < this.usuarios.size()) {
			if (this.usuarios.get(index).getEmail().equals(email)) {
				usuario = this.usuarios.get(index);
			}
			index++;
		}
		return usuario;
	}
	
	public boolean altaUsuario(String email, String apellido, int edad, CategoriaUsuario categoria) {
		boolean altaExitosa = false;
		if (this.buscarUsuario(email) == null) {
			this.usuarios.add(new Usuario(email, apellido, edad, categoria));
			altaExitosa = true;
		}
		return altaExitosa;
	}
	
	public void listarUsuarios() {
		for (Usuario usuario: this.usuarios) {
			System.out.println(usuario);
		}
	}
	
	private boolean esCancionDisponible(Usuario usuario, Cancion cancion) {
		boolean esDisponible = true;
		if (usuario.getCategoria() == CategoriaUsuario.PREMIUM) {
			esDisponible = true;
		}
		else if (!cancion.esGratuita() && usuario.getCategoria() != CategoriaUsuario.PREMIUM) {
			esDisponible = false;
		}
		return esDisponible;
	}
	public ResultadoEscucharCancion escucharCancion(String email, String nombreCancion, String autor) {
		ResultadoEscucharCancion resultado = ResultadoEscucharCancion.CANCION_ESCUCHADA;
		Usuario usuario = this.buscarUsuario(email);
		Cancion cancion = this.buscarCancion(nombreCancion, autor);
		
		if (usuario == null) {
			resultado = ResultadoEscucharCancion.USUARIO_INEXISTENTE;
		}
		else if (cancion == null) {
			resultado = ResultadoEscucharCancion.CANCION_INEXISTENTE;
		}
		else if (usuario.getCategoria() == CategoriaUsuario.GRATUITO && usuario.cantidadCancionesEscuchadas()==50) {
			resultado = ResultadoEscucharCancion.LIMITE_ALCANZADO;
		}
		else if (!this.esCancionDisponible(usuario, cancion)) {
			resultado = ResultadoEscucharCancion.CANCION_NO_DISPONIBLE;
		}
		
		if (resultado == ResultadoEscucharCancion.CANCION_ESCUCHADA) {
			cancion.escuchar();
			usuario.escuchar(cancion);
		}
		
		return resultado;
	}
	
	public void listarCancionesPorUsuario(String email) {
		Usuario usuario = this.buscarUsuario(email);
		if (usuario != null) {
			usuario.listarCancionesEscuchadas();
			System.out.println("Operación exitosa");
		}
		else {
			System.out.println("Usuario inexistente");
		}
	}
}
