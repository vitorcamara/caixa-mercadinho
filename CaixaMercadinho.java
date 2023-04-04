package com.vitorcamara.projetos;

import java.util.Scanner;

public class CaixaMercadinho {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double soma = 0;
		boolean sair = false;

		do {
			System.out.println("=====MERCADINHO====");
			System.out.println("Deseja informar uma nova compra? [S/N]");
			String resp = scan.next();

			if (resp.equalsIgnoreCase("s")) {
				System.out.println("Qual a quantidade produtos:");
				int qtdProdutos = scan.nextInt();

				for (int i = 1; i <= qtdProdutos; i++) {
					System.out.print("Valor do produto " + i + ": R$ ");
					double valor = scan.nextDouble();

					System.out.println("\n(tecle 0 para encerrar a compra ou digite o valor do proximo produto)\n");

					soma += valor;

					if (valor == 0) {
						break;
					}
				}

				System.out.println("Total: " + soma + "\n");
				System.out.println("Valor a pagar em dinheiro: R$");
				double din = scan.nextDouble();
				System.out.println("Troco: R$ " + (din - soma) + "\n");
				System.out.println("Obrigado pela preferencia! Ate a proxima :)");

				soma = 0; //soma recebe zero para que uma nova compra possa ser efetuada

			} else {
				sair = true;
			}

		} while (!sair);
	}

}
