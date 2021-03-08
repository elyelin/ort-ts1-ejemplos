package Ejercicio_02;

public class Test {

	public static void main(String[] args) {
		Edificio edificio = new Edificio("Alvear 999", 5);
		edificio.habitarUnidad(3, "264444444", "Diego");
		edificio.habitarUnidad(5, "265555555", "Juan");
		edificio.agregarDeuda(3, 10);
		edificio.agregarDeuda(5, 900);
		
		edificio.cancelarDeuda(5, 400);
		edificio.cancelarDeuda(3, 100);
		edificio.agregarDeuda(3, 10);
		
		
		System.out.println("Unidades");
		edificio.listarUnidades();
		System.out.println("Morosos");
		edificio.listarMorosos();;
		
	}

}
