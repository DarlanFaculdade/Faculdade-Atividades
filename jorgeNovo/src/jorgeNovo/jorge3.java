package jorgeNovo;

import java.util.Scanner;

public class jorge3 {

	public static void main(String[] args) {
		
		int numb, multiplicacao = 0, resultado = 0;
		Scanner jorge3 = new Scanner(System.in);
		
		System.out.println("Escreva o numero:");
		numb = jorge3.nextInt();
		
		System.out.println("Multiplicação do Numero Escrito:\n");
		
		while (multiplicacao <= 10) {
			resultado = numb * multiplicacao;
			System.out.println(numb + " x " + multiplicacao + " = " + resultado);
			multiplicacao++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
