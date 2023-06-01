package teste;

import java.util.Scanner;

public class jorgeAtividade {

	public static void main(String[] args) {
		
		String[] nome = new String[5];
		int[] idade = new int[5];
		int idadeMaisNovo = 0, idadeMaisVelho = 0;
		
		Scanner jorge4 = new Scanner(System.in);
		
		System.out.println("Nome das Pessoas");
		
		for (int i = 0; i <= 2; i++) {
			System.out.println("Usuario " + "Nº" + (i + 1));
			System.out.print("Nome: ");
			nome[i] = jorge4.nextLine();
			System.out.print("Idade: ");
			idade[i] = jorge4.nextInt();
			jorge4.nextLine();
		}
		
		for (int i = 0; i <= 2; i++) {
			
			if (idade[i] < idadeMaisNovo) {
				idadeMaisNovo = i;
			}
			
			if (idade[i] > idadeMaisVelho) {
				idadeMaisVelho = i;
			}
		}
		
		System.out.println();
		System.out.println("Usuario Mais Novo:\n " + nome[idadeMaisNovo] + " com " + idade[idadeMaisNovo] + " Anos");
		System.out.println();
		System.out.println("Usuario Mais Velho:\n " + nome[idadeMaisVelho] + " com " + idade[idadeMaisVelho] + " Anos");
		
	}

}
