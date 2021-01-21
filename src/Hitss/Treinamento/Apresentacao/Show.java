package Hitss.Treinamento.Apresentacao;

import java.util.Scanner;

public class Show {
	public static void main(String[] args) {
		System.out.println("");
		System.out.println("         Hitss Treinamento");
		System.out.println("");
		System.out.println("Menu de opções:");
		System.out.println("1. Somar dois números.");
		System.out.println("2. Número ao quadrado.");
		System.out.println("");
		System.out.println("Diite a opção desejada");
		System.out.println("");
		try {
			Scanner teclado = new Scanner(System.in);
			int opcao = teclado.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Digite o 1º número:");
				int num1 = teclado.nextInt();
				System.out.println("");
				System.out.println("Digite o 2º número:");
				int num2 = teclado.nextInt();
				System.out.println("");
				int soma = num1 + num2;
				System.out.println("O Resultado é: " + soma);
				break;
			case 2:
				System.out.println("Digita um número");
				int num3 = teclado.nextInt();
				int quad = num3 * num3;
				System.out.println("");
				System.out.println("O Número ao quadrado é: " + quad);
				break;
			default:
				System.out.println("Opção inválida.");
				break;
			}
		} catch (Exception e) {
			System.out.println("Erro de processamento: " + e.getMessage());
		}
	}
}
