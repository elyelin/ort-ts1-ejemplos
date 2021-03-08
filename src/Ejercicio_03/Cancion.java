package Ejercicio_03;

public class Cancion {
	private String nombre;
	private String autor;
	private String genero;
	private int diasPublicacion;
	private int vecesEscuchada;
	
	private static int GRATIS_DIAS = 7;
	private static int GRATIS_ESCUCHAS = 1000;

	public Cancion(String nombre, String autor, String genero, int diasPublicacion) {
		this.nombre = nombre;
		this.autor = autor;
		this.genero = genero;
		this.diasPublicacion = diasPublicacion;
		this.vecesEscuchada = 0;
	}
	
	@Override
	public String toString() {
		return "Cancion [nombre=" + nombre + ", autor=" + autor + ", genero=" + genero + ", diasPublicacion="
				+ diasPublicacion + ", vecesEscuchada=" + vecesEscuchada + "]";
	}
	
	public void escuchar() {
		this.setVecesEscuchada(this.getVecesEscuchada()+1);
	}
	
	public boolean esGratuita() {
		boolean gratuita = false;
		if (this.diasPublicacion >= GRATIS_DIAS) {
			gratuita = true;
		}
		else if (this.getVecesEscuchada() >= GRATIS_ESCUCHAS) {
			gratuita = true;
		}
		return gratuita;
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	private void setAutor(String autor) {
		this.autor = autor;
	}

	private String getGenero() {
		return genero;
	}

	private void setGenero(String genero) {
		this.genero = genero;
	}

	public int getDiasPublicacion() {
		return diasPublicacion;
	}

	private void setDiasPublicacion(int diasPublicacion) {
		this.diasPublicacion = diasPublicacion;
	}

	public int getVecesEscuchada() {
		return vecesEscuchada;
	}

	private void setVecesEscuchada(int vecesEscuchada) {
		this.vecesEscuchada = vecesEscuchada;
	}
	
	
}
