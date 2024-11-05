package lacos.repeticao;

import java.util.Scanner;

public class ExDoWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero, somaPositivos = 0;

		do {
			System.out.print("Digite um número: ");
			numero = scanner.nextInt();

			if (numero > 0) {
				somaPositivos = somaPositivos + numero;
			}
		} while (numero != 0);

		System.out.println("A soma dos números positivos é: " + somaPositivos);

		scanner.close();

	}

}
