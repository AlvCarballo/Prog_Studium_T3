package es.Studium.tema3CadEjer16;

import java.util.Scanner;

public class QuitarEspaciosPrincipio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String texto1, texto2="";
		boolean letra=false;
		System.out.println("indique la palabra a cambiar");
		texto1=teclado.nextLine();
		teclado.close();
		for(int i=0; i<texto1.length(); i++)
		{
			if(!letra)
			{
				if(texto1.charAt(i) !=' ')
				{
					letra=true;
					texto2=texto2+texto1.charAt(i);
				}
			}
		texto2=texto2+texto1.charAt(i);
			
		}
		System.out.println(texto2);
	}

}
