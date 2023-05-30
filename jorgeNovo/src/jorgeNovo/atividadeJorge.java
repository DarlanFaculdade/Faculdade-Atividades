package jorgeNovo;

import java.util.Scanner;

public class atividadeJorge {

	public static void main(String[] args) {
		
		int numero, acumulativo = 0;
		Scanner jorge = new Scanner(System.in);
		
		System.out.println("Digite um Numero");
		numero = jorge.nextInt();
		
		while (numero != 0) {
			acumulativo = acumulativo + numero;
			System.err.println("Digite um Numero Novamente! (Para Sair do Loop aperte 0)");
			numero = jorge.nextInt();
		}
		
		System.out.println("Soma dos Numeros digitados:\n" + acumulativo);
		
		
		
		
		
		
		
		
		
		

	}

}
