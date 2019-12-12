package es.Studium.cadEjer14;

import java.util.Scanner;

public class CambiarAxHa {

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		String palabra;
		System.out.println("indique la palabra a cambiar");
		palabra=teclado.nextLine();
		teclado.close();
		System.out.println(palabra.replaceAll("a", "ha"));
		
	}

}
