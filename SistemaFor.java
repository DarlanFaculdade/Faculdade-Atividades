package teste;

import java.util.Scanner;

public class treinamento {

	public static void main(String[] args) {
		
		int N, soma = 0;
		Scanner jorge2 = new Scanner(System.in);
		
		System.out.println("Digite o numero de Repetições:");
		N = jorge2.nextInt();
		
		for (int i = 0; i <= N; i++) {
			System.out.println("Digite um numero!");
			N = jorge2.nextInt();
			soma = soma + N;
		}
		
		System.out.println("Resultado\n" + soma);
		
		
		
		
		
		
	}

}
