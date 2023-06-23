package teste;

import java.util.Scanner;

public class treinamentoTeste {

	public static void main(String[] args) {
		
		int titulo, candidato = 0, voto = 0;
		int lula = 0;
		int ciro = 0;
		int bolsonaro = 0;
		int soraya = 0;
		int simone = 0;
		Scanner votacao = new Scanner(System.in);
		
		System.out.println("Insira seu Titulo de Eleitor:");
		titulo = votacao.nextInt();
		
		while (titulo <= 0) {
			System.err.println("Esse Titulo de Eleitor não Existe");
			System.out.println("Insira Novamente:");
			titulo = votacao.nextInt();
		}
		
		System.out.println("Digite o Numero do Candidato:");
		candidato = votacao.nextInt();
		System.out.println();
		
		while (titulo > 0) {
			voto++;
			System.out.println("Voto Nº" + voto + " Confirmado!");
			System.out.println();
			System.out.println("Vote Novamente (Para parar de votar aperter 0!)");
			System.out.print("Digite o Numero do Candidato:");
			candidato = votacao.nextInt();
			System.out.println();
			
		if (candidato == 13) {
			lula++;
		}
		else if (candidato == 22) {
			bolsonaro++;
		}
		else if (candidato == 12) {
			ciro++;
		}
		else if (candidato == 15) {
			simone++;
		}
		else if (candidato == 44) {
			soraya++;
		}
		else if (candidato <= 0) {
			System.out.println();
			System.out.println("Votação Finalizada");
			System.out.println("Votos em Lula: " + lula++);
			System.out.println("Votos em Bolsonaro " + bolsonaro);
			System.out.println("Votos em Simone " + simone);
			System.out.println("Votos em Soraya " + soraya);
			System.out.println("Votos em Ciro Gomes " + ciro);
			System.out.println("Total de Votos: " + voto);
			break;
		}
		
		}
	}

}
