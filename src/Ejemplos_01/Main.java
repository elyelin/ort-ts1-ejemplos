package Ejemplos_01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList();
		int numero;
		
		for (int i=0; i<3; i++) {
			System.out.println("Ingrese un numero");
			numero = input.nextInt();
			input.nextLine();
			numeros.add(numero);
		}
		
		numeros.add(1,10);
		numeros.set(3, 20);
		
		for (int i=0; i<numeros.size(); i++) {
			System.out.println("index " + i + " numero " + numeros.get(i));
		}
		
		input.close();
	}

}
