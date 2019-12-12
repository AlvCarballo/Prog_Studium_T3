package es.Studium.TabEjer9Tema3;

import java.util.Scanner;

public class Dimenciones2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char tabla[][] = new char[3][4];
		int i, e;
		Scanner teclado = new Scanner(System.in);
		
		for(i=0;i<3;i++)
		{
			for(e=0;e<4;e++)
			{
				System.out.println("Ingrese el el caracter de la fila " +(i+1)+" y la columna "+(e+1));
				tabla[i][e] = teclado.next().charAt(0);
			}
		}
		
		teclado.close();
		for(i=0;i<3;i++)
		{
			for(e=0;e<4;e++)
			{
				System.out.println("El caracter introducido de la fila " +(i+1)+" y la columna "+(e+1)+" es "+tabla[i][e]);
			}
		}
	}

}
