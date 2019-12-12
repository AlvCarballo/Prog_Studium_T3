package es.Studium.tabEjer10Tema3;


public class SumaPosicion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tabla[][] = new int[10][10];
		int i, e;
		
		for(i=0;i<10;i++)
		{
			for(e=0;e<10;e++)
			{
				tabla[i][e]=i+e;
			}
		}
		for(i=0;i<10;i++)
		{
			for(e=0;e<10;e++)
			{
				System.out.println("El valor introducido de la fila " +(i)+" y la columna "+(e)+" es "+tabla[i][e]);
			}
		}
	}

}
