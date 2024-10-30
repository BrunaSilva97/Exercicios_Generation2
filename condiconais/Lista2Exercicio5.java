/*
 * Com base na tabela abaixo, escreva um algoritmo em Java que leia o Nome do Colaborador (String), 
 * o Código do Cargo do Colaborador (número inteiro de 1 a 6) e o Salário (número float). A seguir, 
 * mostre na tela o Nome do Colaborador, o Cargo e o novo Salário reajustado.
 */
package lacos.condiconais;

import java.util.Scanner;

public class Lista2Exercicio5 {

	public static void main(String[] args) {

		int codigo, quantidade;
		Scanner valorTotal = new Scanner(System.in);

		System.out.println("Código do Produto (opções de 1 a 6): ");
		codigo = valorTotal.nextInt();

		System.out.println("Quantidade do Produto: ");
		quantidade = valorTotal.nextInt();

		switch (codigo) {
		case 1:
			System.out.println("Produto: Cachorro Quente \nValor total: R$ " + quantidade * 10);
			break;
		case 2:
			System.out.println("Produto: X-Salada \nValor total: R$ " + quantidade * 15);
			break;
		case 3:
			System.out.println("Produto: X-Bacon \nValor total: R$ " + quantidade * 18);
			break;
		case 4:
			System.out.println("Produto: Bauru \nValor total: R$ " + quantidade * 12);
			break;
		case 5:
			System.out.println("Produto: Refrigerante \nValor total: R$ " + quantidade * 8);
			break;
		case 6:
			System.out.println("Produto: Suco de Laranja \nValor total: R$ " + quantidade * 13);
			break;

		default:
			System.out.println("Escolha uma opção válida.");
			break;

		}

	}

}
