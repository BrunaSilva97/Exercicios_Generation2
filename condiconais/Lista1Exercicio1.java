//Faça um algoritmo em Java que leia 3 valores inteiros A, B e C e imprima na tela se a soma de A + B é maior, menor ou igual a C

package lacos.condiconais;

import java.util.Scanner;

public class Lista1Exercicio1 {

	public static void main(String[] args) {

		int numeroA = 4, numeroB = 3, numeroC = 4;
		Scanner resultado = new Scanner(System.in);

		System.out.println("Digite o número A:");
		numeroA = resultado.nextInt();

		System.out.println("Digite o número B:");
		numeroB = resultado.nextInt();

		System.out.println("Digite o número C:");
		numeroC = resultado.nextInt();

		if ((numeroA + numeroB) > numeroC) {
			System.out.println("A Soma de A + B é Maior do que C.");
		}

		if ((numeroA + numeroB) < numeroC) {
			System.out.println("A Soma de A + B é Menor do que C.");
		}

		if ((numeroA + numeroB) == numeroC) {
			System.out.println("A Soma de A + B é Igual a C.");
		}

	}

}
