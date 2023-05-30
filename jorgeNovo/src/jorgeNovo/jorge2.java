package jorgeNovo;

import java.util.Scanner;

public class jorge2 {

	public static void main(String[] args) {
		
		int N, acumulativo = 0;
		Scanner jorge2 = new Scanner(System.in);
		
		System.out.println("Escreva quantas repetiçoes terá:");
		N = jorge2.nextInt();
		
		for (int i = 0; i <= N; i++) {
			System.out.println("Digite outro numero!");
			N = jorge2.nextInt();
			acumulativo = acumulativo + N;
		}
		
		System.out.println("Soma dos Numeros Lidos!\n" + acumulativo);
		
		
		
		
		

	}

}
