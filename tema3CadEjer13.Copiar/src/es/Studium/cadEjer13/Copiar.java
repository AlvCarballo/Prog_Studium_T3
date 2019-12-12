package es.Studium.cadEjer13;

import java.util.Scanner;

public class Copiar {

	public static void main(String[] args) 
	{
	
		Scanner teclado = new Scanner(System.in);
		String palabra1, palabra2;

		System.out.println("indique la cadena a copiar");
		palabra1=teclado.nextLine();
		teclado.close();
		palabra2=palabra1;
	}

}
