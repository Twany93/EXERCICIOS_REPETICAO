package EXERCICIOS_REPETI��O;

import java.util.Scanner;

public class Exercicio_02_For {

	public static void main(String[] args)
	{
		try (Scanner entrada = new Scanner(System.in)) {
			int contador, numero, numeroPar=0,numeroImpar=0;
			
			for(contador=1;contador<=10;contador=contador+1) 
			{
				System.out.println("Digite o "+contador+"� n�mero: ");
				numero= entrada.nextInt();
				if(numero==0) 
				{
					System.out.println("O n�mero 0 � neutro\n");
				}
				else if(numero%2==0) 
				{
					System.out.println("o n�mero "+numero+" � par\n");
					numeroPar=numeroPar+1;
				}
				else 
				{
					System.out.println("o n�mero "+numero+" � �mpar\n");
					numeroImpar=numeroImpar+1;
				}
					
			}
			
			System.out.println("======================================= ");
			System.out.println("Quantidade de n�meros pares: "+numeroPar);
			System.out.println("Quantidade de n�meros �mpares: "+numeroImpar);
			System.out.println("\nFIM DO PROGRAMA");
			
entrada.close();
		}	
	}
}

