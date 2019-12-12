package es.Studium.cadEjer5.Igualdad;

import java.util.Scanner;

public class Igualdad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String c1, c2;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame la primera cadena");
		c1 = teclado.next();
		System.out.println("Dame la segunda cadena");
		c2 = teclado.next();
		teclado.close();
		if(c1.contentEquals(c2))
		{
			System.out.println("Las cadenas son iguales");
		}
		else
		{
			System.out.println("Las cadenas no son iguales");
		}
	}

}
