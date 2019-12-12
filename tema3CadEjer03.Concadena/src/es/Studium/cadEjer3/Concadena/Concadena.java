package es.Studium.cadEjer3.Concadena;

import java.util.Scanner;

public class Concadena {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String c1,c2,c3;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame la primera cadena");
		c1 = teclado.next();

		System.out.println("Dame la segunda cadena");
		c2 = teclado.next();
		teclado.close();
		c3=c1+" "+c2;
		System.out.println(String.format("La Cadena \"%s\" concadenada con la cadena \"%s\" resulta \"%s\"", c1, c2, c3));
	}

}
