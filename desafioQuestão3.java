package teste;

import java.util.Scanner;

public class desafioA3 {

	public static void main(String[] args) {
		
		String nome;
		double salario, reajuste, calculo, total; 
		double adicional;
		Scanner desafio = new Scanner(System.in);
		
		System.out.println("Digite o Nome do Funcionario: ");
		nome = desafio.next();
		
		System.out.println("Informe o Salário: ");
		salario = desafio.nextDouble();
		
		System.out.println();
		
		if (salario <= 1200) {
			reajuste = 0.2 * salario;
			calculo = 1.2 * salario;
			adicional = 20;
			System.out.println("Nome do Funcionario:\n " + nome);
			System.out.println("Salário Antes:\n " + salario);
			System.out.println("Percentual Adicionado:\n " + adicional + "%");
			System.out.println("Valor Adicionado:\n " + reajuste);
			System.out.printf("Novo Salario:\n %.2f" + calculo);
		}
		else if (salario <= 2300) {
			reajuste = 0.15 * salario;
			calculo = 1.15 * salario;
			adicional = 15;
			System.out.println("Nome do Funcionario:\n " + nome);
			System.out.println("Salário Antes:\n " + salario);
			System.out.println("Percentual Adicionado:\n " + adicional + "%");
			System.out.println("Valor Adicionado:\n " + reajuste);
			System.out.printf("Novo Salario:\n %.2f" + calculo);
		}
		else if (salario <= 3700) {
			reajuste = 0.1 * salario;
			calculo = 1.1 * salario;
			adicional = 10;
			System.out.println("Nome do Funcionario:\n " + nome);
			System.out.println("Salário Antes:\n " + salario);
			System.out.println("Percentual Adicionado:\n " + adicional + "%");
			System.out.println("Valor Adicionado:\n " + reajuste);
			System.out.printf("Novo Salario:\n %.2f" , calculo);
		}
		else if (salario >= 3700) {
			reajuste = 0.05 * salario;
			calculo = 1.05 * salario;
			adicional = 5;
			System.out.println("Nome do Funcionario:\n " + nome);
			System.out.println("Salário Antes:\n " + salario);
			System.out.println("Percentual Adicionado:\n " + adicional + "%");
			System.out.println("Valor Adicionado:\n " + reajuste);
			System.out.printf("Novo Salario:\n %.2f" , calculo);
		}
		
		
		
		
		
		
		
	}

}
