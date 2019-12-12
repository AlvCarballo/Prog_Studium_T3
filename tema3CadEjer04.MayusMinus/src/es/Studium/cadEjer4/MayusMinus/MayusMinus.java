package es.Studium.cadEjer4.MayusMinus;

import java.util.Scanner;

public class MayusMinus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String c1;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame la primera cadena");
		c1 = teclado.next();
		teclado.close();
		
		System.out.println("Mayúsculas: "+c1.toUpperCase());
		System.out.println("Minúsculas: "+c1.toLowerCase());
	}

}
