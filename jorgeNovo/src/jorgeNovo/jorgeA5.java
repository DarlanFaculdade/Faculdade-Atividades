package teste;

import java.util.Scanner;

public class jorgeA5 {

	public static void main(String[] args) {
		
		int bolsonaro = 1, lula = 1, candidato, titulo;
		Scanner jorge5 = new Scanner(System.in);
		
//		Digitação do Titulo
		System.out.println("Digite o Numero do seu Titulo:");
		titulo = jorge5.nextInt();
//		Esse System é so para da um Espaço na impressão
		System.out.println();
		
//		Repetição do Titulo
			while (titulo <= 0) {
				System.err.println("Esse Titulo não Existe");
				System.out.println();
				System.out.println("Digite o Titulo Novamente:");
				titulo = jorge5.nextInt();
		}
		
//		Digitação do Candidato
		System.out.println("Digite o Numero do Candidato a Presidencia:");
		candidato = jorge5.nextInt();
		System.out.println();
			
//		Repetição do Candidato Lula
			while (candidato == 13) {
				System.out.println("-Votou em Lula!" + " " + lula + "-");
				lula++;
				System.out.println();
				System.out.print("Vote Novamente:");
				candidato = jorge5.nextInt();
//				Esse System é so para da um Espaço na impressão
				System.out.println();
			}
//			Repetição do Candidato Bolsonaro
			while (candidato == 22) {
				System.out.println("-Votou em Bolsonaro!" + " " + bolsonaro + "-");
				bolsonaro++;
				System.out.println();
				System.out.print("Vote Novamente:");
				candidato = jorge5.nextInt();
//				Esse System é so para da um Espaço na impressão
				System.out.println();
			}
			
//			Impressão dos Votos acumulados
			System.out.println("Votos no Lula: " + lula);
			System.out.println("Votos no Bolsonaro: " + bolsonaro);
			
//			Condições do Vencedor 
			if (lula++ > bolsonaro++) {
				System.out.println("Novo Presidente do Brasil é Lula");
			}
			else if (bolsonaro++ > lula++) {
				System.out.println("Novo Presidente do Brasil é Bolsonaro");
			}
			else {
				System.out.println("Terá Segundo Turno");
			}
		
		
		
		

		
	}

}
