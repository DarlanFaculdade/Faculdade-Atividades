package teste;

import java.util.Scanner;

public class aulaA1 {

	public static void main(String[] args) {
		
		String nome1;
		char sexo1;
		double valor1, total;
		Scanner treina = new Scanner(System.in);
		
		System.out.println("Nome do Cliente: ");
		nome1 = treina.next();
		
		System.out.println("Valor da Compra: ");
		valor1 = treina.nextInt();
		
		System.out.println("Digite seu Sexo: (F) ou (M)");
		sexo1 = treina.next().charAt(0);
		
		System.out.println();
		
		if (sexo1 == 'F') {
			total = 1.13 * valor1;
			System.out.println("Nome do Cliente:\n" + nome1);
			System.out.println("Valor da Compra:\n" + total);
			System.out.println("Sexo do Cliente:\n" + sexo1);
		}
		else if (sexo1 == 'f') {
			total = 1.13 * valor1;
			System.out.println("Nome do Cliente:\n" + nome1);
			System.out.println("Valor da Compra:\n" + total);
			System.out.println("Sexo do Cliente:\n" + sexo1);
		}
		else if (sexo1 == 'M') {
			total = 1.05 * valor1;
			System.out.println("Nome do Cliente:\n" + nome1);
			System.out.println("Valor da Compra:\n" + total);
			System.out.println("Sexo do Cliente:\n" + sexo1);
		}
		else if (sexo1 == 'm') {
			total = 1.05 * valor1;
			System.out.println("Nome do Cliente:\n" + nome1);
			System.out.println("Valor da Compra:\n" + total);
			System.out.println("Sexo do Cliente:\n" + sexo1);
		}
	}

}
