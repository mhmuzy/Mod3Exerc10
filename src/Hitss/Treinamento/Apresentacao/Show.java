package Hitss.Treinamento.Apresentacao;

import java.util.Scanner;

public class Show {
	public static void main(String[] args) {
		System.out.println("");
		System.out.println("         Hitss Treinamento");
		System.out.println("");
		System.out.println("Menu de op��es:");
		System.out.println("1. Somar dois n�meros.");
		System.out.println("2. N�mero ao quadrado.");
		System.out.println("");
		System.out.println("Diite a op��o desejada");
		System.out.println("");
		try {
			Scanner teclado = new Scanner(System.in);
			int opcao = teclado.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Digite o 1� n�mero:");
				int num1 = teclado.nextInt();
				System.out.println("");
				System.out.println("Digite o 2� n�mero:");
				int num2 = teclado.nextInt();
				System.out.println("");
				int soma = num1 + num2;
				System.out.println("O Resultado �: " + soma);
				break;
			case 2:
				System.out.println("Digita um n�mero");
				int num3 = teclado.nextInt();
				int quad = num3 * num3;
				System.out.println("");
				System.out.println("O N�mero ao quadrado �: " + quad);
				break;
			default:
				System.out.println("Op��o inv�lida.");
				break;
			}
		} catch (Exception e) {
			System.out.println("Erro de processamento: " + e.getMessage());
		}
	}
}
