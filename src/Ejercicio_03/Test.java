package Ejercicio_03;

public class Test {

	public static Aplicacion aplicacion;
	
	public static void testAltaCancion(String nombre, String autor, String genero, int diasPublicacion) {
		System.out.println("Dando de alta cancion nombre: " + nombre + " autor: " + autor 
				+ " genero: " + genero + " diasPublicacion: " + diasPublicacion);
		if (aplicacion.altaCancion(nombre, autor, genero, diasPublicacion)) {
			System.out.println("Alta exitosa");
		}
		else {
			System.out.println("No se pudo dar de alta");
		}
	}
	
	public static void testAltaUsuario(String email, String apellido, int edad, CategoriaUsuario categoria) {
		System.out.println("Dando de alta usuario email: " + email + " apellido: " + apellido 
				+ " edad: " + edad + " categoria: " + categoria);
		if (aplicacion.altaUsuario(email, apellido, edad, categoria)) {
			System.out.println("Alta exitosa");
		}
		else {
			System.out.println("No se pudo dar de alta");
		}
	}
	
	public static void testEscucharCancion(String email, String nombreCancion, String autor) {
		System.out.println("Escuchar cancion email: " + email + " nombreCancion: " + nombreCancion 
				+ " autor: " + autor);
		
		System.out.println(aplicacion.escucharCancion(email, nombreCancion, autor));
	}
	
	public static void testListartCancionesPorUsuario(String email) {
		System.out.println("Listar canciones de " + email);
		aplicacion.listarCancionesPorUsuario(email);
	}
	
	public static void main(String[] args) {
		aplicacion = new Aplicacion();
		
		testAltaCancion("The Wall", "Pink Floyd", "Rock", 5000);
		testAltaCancion("The Wall", "Pink Floyd", "Rock", 5000);
		testAltaCancion("Sapo pepe", "Jose", "Pop", 6);
		
		testAltaUsuario("diego.weinstein@ort.edu.ar", "Weinstein", 25, CategoriaUsuario.GRATUITO);
		testAltaUsuario("diego.weinstein@ort.edu.ar", "Weinstein", 25, CategoriaUsuario.GRATUITO);
		testAltaUsuario("juan.lopez@ort.edu.ar", "Juan", 30, CategoriaUsuario.PREMIUM);
		testAltaUsuario("fabian.perez@ort.edu.ar", "Perez", 60, CategoriaUsuario.REGISTRADO);
		
		testEscucharCancion("diego.weinstein@ort.edu.ar", "The Wall", "Pink Floyd");
		testEscucharCancion("diego.weinstein@ort.edu.ar", "Sapo pepe", "Jose");
		testEscucharCancion("juan.lopez@ort.edu.ar", "The Wall", "Pink Floyd");
		
		for (int i=0; i<1000; i++) {
			testEscucharCancion("juan.lopez@ort.edu.ar", "Sapo pepe", "Jose");
		}
		
		testEscucharCancion("diego.weinstein@ort.edu.ar", "Sapo pepe", "Jose");
		
		aplicacion.listarCanciones();
		aplicacion.listarUsuarios();
		
		testListartCancionesPorUsuario("fruta@ort.edu.ar");
		testListartCancionesPorUsuario("diego.weinstein@ort.edu.ar");
		
	}

}
