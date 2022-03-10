package EXERCICIOS_REPETIÇÃO;

import java.util.Scanner;

public class Exercicio_02_For {

	public static void main(String[] args)
	{
		try (Scanner entrada = new Scanner(System.in)) {
			int contador, numero, numeroPar=0,numeroImpar=0;
			
			for(contador=1;contador<=10;contador=contador+1) 
			{
				System.out.println("Digite o "+contador+"º número: ");
				numero= entrada.nextInt();
				if(numero==0) 
				{
					System.out.println("O número 0 é neutro\n");
				}
				else if(numero%2==0) 
				{
					System.out.println("o número "+numero+" é par\n");
					numeroPar=numeroPar+1;
				}
				else 
				{
					System.out.println("o número "+numero+" é ímpar\n");
					numeroImpar=numeroImpar+1;
				}
					
			}
			
			System.out.println("======================================= ");
			System.out.println("Quantidade de números pares: "+numeroPar);
			System.out.println("Quantidade de números ímpares: "+numeroImpar);
			System.out.println("\nFIM DO PROGRAMA");
			
entrada.close();
		}	
	}
}

