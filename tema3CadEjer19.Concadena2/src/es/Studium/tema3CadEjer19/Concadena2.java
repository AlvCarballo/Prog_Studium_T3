package es.Studium.tema3CadEjer19;
/*
 * Concatena2 - Realizar un programa que lea dos cadenas y las concatene dejando un espacio entre las dos.
 */
import java.util.Scanner;
public class Concadena2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String c1,c2,c3;//Creamos las variables
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame la primera cadena");
		c1 = teclado.next();//Leemos la primera cadena por teclado
		System.out.println("Dame la segunda cadena");
		c2 = teclado.next();//Leemos las segunda cadena por teclado
		teclado.close();
		c3=c1+" "+c2;//Concadenamos las 2 cadenas dejando un espacio entre ellas
		System.out.println(String.format("La Cadena \"%s\" concadenada con la cadena \"%s\" resulta \"%s\"", c1, c2, c3));//Mostramos el resultado por pantalla
	}
}
