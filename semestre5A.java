package teste;

import java.util.Scanner;

public class semestre5A {

	public static void main(String[] args) {
		
		int numb1, numb2, numb3;
		Scanner total = new Scanner(System.in);
		
		System.out.println("Numero 1");
		numb1 = total.nextInt();
		
		System.out.println("Numero 2");
		numb2 = total.nextInt();
		
		System.out.println("Numero 3");
		numb3 = total.nextInt();
		
//		NUMERO 1 MAIOR QUE O NUMERO 2 / NUMERO 2 MAIOR QUE O NUMERO 3
		if (numb1 > numb2 && numb2 > numb3) {
			System.out.println(numb1 + " " + numb2 + " " + numb3);
		}
//		NUMERO 1 MENOR QUE O NUMERO 2 / NUMERO 3 MAIOR QUE O NUMERO 1
		else if (numb1 < numb2 && numb3 > numb2) {
			System.out.println(numb3 + " " + numb2 + " " + numb1);
		}
//		NUMERO 3 MAIOR QUE O NUMERO 2 / NUMERO 2 MAIOR QUE O NUMERO 1
		else if (numb3 > numb2 && numb3 > numb1) {
			System.out.println(numb3 + " " + numb2 + " " + numb1);
		}
//		NUMERO 3 MAIOR QUE O NUMERO 1 / NUMERO 3 MAIOR QUE O NUMERO 2
		else if (numb3 > numb2 && numb2 > numb1) {
			System.out.println(numb3 + " " + numb1 + " " + numb2);
		}
//		NUMERO 3 MENOR QUE O NUMERO 1 / NUMERO 2 MAIOR QUE O NUMERO 3 
		else if (numb3 < numb1 && numb2 > numb3){
			System.out.println(numb2 + " " + numb1 + " " + numb3);
		}
//		NUMERO 2 MAIOR QUE O NUMERO 3 / NUMERO 1 MENOR QUE O NUMERO 3
		else if (numb2 > numb3 && numb1 < numb3) {
			System.out.println(numb2 + " " + numb3 + " " + numb1);
		}
	}
}	