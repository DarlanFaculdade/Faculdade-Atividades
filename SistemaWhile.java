package teste;

import java.util.Scanner;

public class treinamentoWhile {

	public static void main(String[] args) {
		
		int numero, acumulativo = 0;
		Scanner jorge = new Scanner(System.in);
		
		System.out.println("Digite o Numero:");
		numero = jorge.nextInt();
		
		while (numero != 0) {
			acumulativo = acumulativo + numero;
			System.out.println("Digite o Numero Novamente!");
			numero = jorge.nextInt();
		}
		
		System.out.println("Somas dos Numeros\n" + acumulativo);
		
		
		
		
		
		
	}

}
