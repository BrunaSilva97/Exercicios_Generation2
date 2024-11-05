package lacos.repeticao;

import java.util.Scanner;

public class ExWhile {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int idade, contadorMenor21 = 0, contadorMaior50 = 0;

		while (true) {
			System.out.print("Digite uma idade: ");
			idade = scanner.nextInt();

			if (idade < 0) {
				break;
			}

			if (idade < 21) {
				contadorMenor21++;
			}
			if (idade > 50) {
				contadorMaior50++;
			}
		}

		System.out.println("Total de pessoas menores de 21 anos: " + contadorMenor21);
		System.out.println("Total de pessoas maiores de 50 anos: " + contadorMaior50);

		scanner.close();

	}
}
