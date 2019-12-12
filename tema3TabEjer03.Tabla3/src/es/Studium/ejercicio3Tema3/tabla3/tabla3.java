package es.Studium.ejercicio3Tema3.tabla3;

import java.util.Scanner;

public class tabla3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tabla[] = new int[4];
		int i;
		Scanner teclado = new Scanner(System.in); 
		// Recorrido para rellenar la tabla 
		for(i=0;i<4;i++)
		{
		System.out.println("Ingrese el valor de la posición: "+i);
		tabla[i] = teclado.nextInt(); }
		// Recorrido para mostrar los valores de la tabla 
		for(i=3;i>-1;i--)
		{
		System.out.println("Tabla["+i+"]="+tabla[i]); }
		teclado.close();
	}

}
