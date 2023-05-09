package desafio1;

import java.util.Scanner;

public class desafio1 {

	public static void main(String[] args) {
		
		String time1, time2, teste;
		int gols1, gols2;
		Scanner placar = new Scanner(System.in);
		
		System.out.println("Nome dos Times: ");
		time1 = placar.next();
		time2 = placar.next();
		
		System.out.println("Gols de Cada Time: ");
		gols1 = placar.nextInt();
		gols2 = placar.nextInt();
		
		if (gols1 > gols2) {
			System.out.println(time1 + " Vencedor!");
			
		}
		else if (gols2 > gols1) {
			System.out.println(time2 + " Vencedor!");
		}
		else {
			System.out.println("Empate!");
		}
		
	}

}
