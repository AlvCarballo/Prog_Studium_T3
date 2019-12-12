package es.Studium.cadEjer14;

import java.util.Scanner;

public class CambiarAxHa2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String palabra, palabra2="";
		System.out.println("indique la palabra a cambiar");
		palabra=teclado.nextLine();
		teclado.close();
		//recorremos la palabra
		
		
		for(int i=0; i<palabra.length();i++)
		{
			//Comparamos los caracteres para ver si tienen Vocales
			if(palabra.charAt(i)=='a')
			{
				palabra2=palabra2+"h"+palabra.charAt(i);
			}
			else
			{
				palabra2=palabra2+palabra.charAt(i);
			}
		}
		System.out.println(palabra2);
	}

}
