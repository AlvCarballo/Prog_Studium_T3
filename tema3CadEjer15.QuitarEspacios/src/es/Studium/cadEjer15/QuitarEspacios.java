package es.Studium.cadEjer15;

import java.util.Scanner;

public class QuitarEspacios 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String palabra;
		System.out.println("indique la palabra a cambiar");
		palabra=teclado.nextLine();
		teclado.close();
		System.out.println(palabra.replace(" ", ""));
	}
}
