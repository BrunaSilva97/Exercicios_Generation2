package ex.vetor;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		int vetor[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int numero;
		int posicao = -1;
		int i;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o número que você deseja encontrar: ");
		numero = scanner.nextInt();

		for (i = 0; i < 10; i++) {
			if (vetor[i] == numero) {
				posicao = i;
				break;
			}
		}
		if (posicao != -1) {
			System.out.println("O número " + numero + " está localizado na posição: " + posicao);
		} else {
			System.out.println("O número " + numero + " não foi encontrado!");
		}

		scanner.close();

	}

}