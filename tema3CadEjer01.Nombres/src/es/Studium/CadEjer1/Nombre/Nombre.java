package es.Studium.CadEjer1.Nombre;

import java.util.Scanner;

public class Nombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
			nombre(teclado);
		teclado.close();
	}

	private static void nombre(Scanner teclado) {
		String n1;
		String n2;
		String n3;
		String n4;
		String n5;
		System.out.println("Dame la primera cadena");
		n1 = teclado.next();
		
		System.out.println("Dame la segunda cadena");
		n2 = teclado.next();
		
		System.out.println("Dame la tercera cadena");
		n3 = teclado.next();
		
		System.out.println("Dame la cuarta cadena");
		n4 = teclado.next();
		
		System.out.println("Dame la quinta cadena");
		n5 = teclado.next();
		
		System.out.println(String.format("Las cadenas son %s, %s, %s, %s, %s",n1, n2, n3, n4, n5));
		
	}

}
