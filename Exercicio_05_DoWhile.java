package EXERCICIOS_REPETIÇÃO;

import java.util.Scanner;

public class Exercicio_05_DoWhile {

	public static void main(String[] args) throws InterruptedException {
		Scanner in=new Scanner (System.in);
		int contador=0, numero=0, soma=0;
		
		do
		{
			System.out.println("\nEntre com um valor: ");
			numero= in.nextInt();
			contador=contador+1;
			soma= soma+numero; 
			
			if( numero==0) 
			{
				System.out.println("Você acertou!");
				System.out.println("============================================");
				System.out.println("Soma de todos valores digitados: "+ soma);
				break;
			}
			else 
			{
				System.out.println("ERROOOOU!!...Tente novamente");
			
			}
		}
		while(contador!=0);
		in.close();
	}

}
