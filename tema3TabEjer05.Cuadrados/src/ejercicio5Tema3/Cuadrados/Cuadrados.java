package ejercicio5Tema3.Cuadrados;

import java.util.Scanner;

public class Cuadrados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tabla[] = new int[10];
		int i, numero, numero2, cuadrado;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el valor:");
		numero = teclado.nextInt();
		
		// Recorrido para rellenar la tabla 
		for(i=0;i<10;i++)
		{
			numero2=numero+i+1;
			cuadrado=numero2;
			cuadrado= cuadrado*cuadrado;
		tabla[i] = cuadrado; }
		// Recorrido para mostrar los valores de la tabla 
		for(i=0;i<=9;i++)
		{
		System.out.println("Tabla["+i+"]="+tabla[i]); }
		teclado.close();
	}

}
