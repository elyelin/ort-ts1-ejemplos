package Ejemplos_04;

public class Main {
	public static void main(String[] args) {
		Agenda agenda = new Agenda();

		agenda.agregar("Diego", "4444-4444", TipoTelefono.CASA);
		agenda.agregar("Juan", "5555-5555", TipoTelefono.TRABAJO);
		agenda.agregar("Diego", "4444-4444", TipoTelefono.CASA);
		
		agenda.borrar("Juan");
		
		agenda.cambiar("Diego", "6666-6666", TipoTelefono.TRABAJO);
		
		agenda.mostrar();
	}

}
