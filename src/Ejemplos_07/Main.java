package Ejemplos_07;

public class Main {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();

		agenda.agregar("Diego", "4444-4444", "Celular");
		agenda.agregar("Diego", "4444-4444", "Fijo");
		agenda.agregar("Juan", "5555-5555", "Fijo");
		
		agenda.borrar("Juan");
		
		agenda.modificarNumero("Diegoxx", "4444-8888");
		agenda.modificarNumero("Diego", "4444-8888");
		
		agenda.mostrar();
	}

}
