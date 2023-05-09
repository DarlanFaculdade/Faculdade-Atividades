package desafio1;

import java.util.Scanner;

public class desafioA2 {

	public static void main(String[] args) {
		
		char letra;
		Scanner desafio = new Scanner(System.in);
		
		
		System.out.println("Digite a Letra: ");
		letra = desafio.nextLine().charAt(0);
		
		if (letra == 'a' || letra == 'A' || letra == 'e' || letra == 'E'
				         || letra == 'i' || letra == 'I' || letra == 'o'
				         || letra == 'O' || letra == 'u' || letra == 'U') {
			System.out.println("Vogal!");
		}
		
		else if (letra == 'b' || letra == 'B' || letra == 'c' || letra == 'C' || letra == 'd' || letra == 'D' ||
				 letra == 'f' || letra == 'F' || letra == 'g' || letra == 'G' || letra == 'j' || letra == 'J' ||
				 letra == 'k' || letra == 'K' || letra == 'l' || letra == 'L' || letra == 'm' || letra == 'M' ||
				 letra == 'n' || letra == 'N' || letra == 'p' || letra == 'P' || letra == 'q' || letra == 'Q' ||
				 letra == 'r' || letra == 'R' || letra == 's' || letra == 'S' || letra == 't' || letra == 'T' ||
				 letra == 'v' || letra == 'V' || letra == 'w' || letra == 'W' || letra == 'x' || letra == 'X' ||
				 letra == 'z' || letra == 'Z' || letra == 'y' || letra == 'Y' ) 
			System.out.println("Consoante!"); {
		
			}
}
}