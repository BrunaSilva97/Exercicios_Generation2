/*
 * Com base na tabela abaixo, escreva um algoritmo em Java, que simule uma Calculadora simples. 
 *O programa deverá ler dois números float: numero1 e numero2, e na sequência ler o Código da operação matemática (número inteiro de 1 a 4).
 *A seguir, mostre na tela o resultado da operação entre os 2 números. 
 *Caso a operação seja diferente do intervalo 1 a 4, mostre a mensagem Operação Inválida!
 */

package lacos.condiconais;

import java.util.Scanner;

public class Lista2Exercicio7 {

	public static void main(String[] args) {
		int numero1, numero2, operação;
		Scanner calculadora = new Scanner(System.in);

		System.out.println("Digite o 1º número: ");
		numero1 = calculadora.nextInt();

		System.out.println("Digite o 2º número: ");
		numero2 = calculadora.nextInt();

		System.out.println("Operação: ");
		operação = calculadora.nextInt();

		switch (operação) {
		case 1:
			System.out.printf(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
			break;
		case 2:
			System.out.printf(numero1 + " - " + numero2 + " = " + (numero1 - numero2));
			break;
		case 3:
			System.out.printf(numero1 + " * " + numero2 + " = " + (numero1 * numero2));
			break;
		case 4:
			System.out.printf(numero1 + " / " + numero2 + " = " + (numero1 / numero2));
			break;

		default:
			System.out.println("Escolha uma opção válida.");
			break;

		}
	}
}
