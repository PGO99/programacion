package Ejercicios_I_E_1_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String args) throws NumberFormatException, IOException {
	
		double nota=0;
		double media;
		double mediaTotal;
		boolean Failsafe= true;
		
		
		
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

	
	do { // estructura para asegurarse de que se recibe el tipo de dato correcto por
		// consola

	try {grgg
		System.out.println("Introducir la nota de Programación");
		nota = Double.parseDouble(teclado.readLine());
		System.out.println("Introducir la nota de Lenguaje de Marcas");
		nota += Double.parseDouble(teclado.readLine());
		System.out.println("Introducir la nota de Bases de Datos");
		nota += Double.parseDouble(teclado.readLine());
		System.out.println("Introducir la nota de Entornos de Desarrollo");
		nota += Double.parseDouble(teclado.readLine());
		System.out.println("Introducir la nota de Sistemas Informaticos");
		nota += Double.parseDouble(teclado.readLine());
		System.out.println("Introducir la nota de Formación y Orientación Laboral");
		nota += Double.parseDouble(teclado.readLine());

		failsafe = false; // variable de control
	}

	catch (NumberFormatException ex) {

		System.out.println("No ha introducido un comando valido");

	}

} while (failsafe);

media = (nota) / 6; // calculamos la media

mediaFinal = Math.floor(media * 10) / 10; // reducimos la cantidad de decimales a 1

System.out.println("la nota media es " + mediaTotal);

	}

}
