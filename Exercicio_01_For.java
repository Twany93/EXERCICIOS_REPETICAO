package EXERCICIOS_REPETIÇÃO;

public class Exercicio_01_For {
	public static void main(String[] args) throws InterruptedException{
		System.out.println("Números de 1000 a 1999 que divididos por 11 tem resto igual a 5: ");
		for(int numero=1000; numero<=1999;numero=numero+1)
			{
				if(numero%11==5)
				{
				System.out.println(numero);
				Thread.sleep(500);
				}
			}
}
}
