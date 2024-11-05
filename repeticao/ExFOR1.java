package lacos.repeticao;

import java.util.Scanner;

public class ExFOR1 {

	public static void main(String[] args) {

		int pares = 0, impares = 0, numero;
		Scanner total = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println("digite o " + (i + 1) + "º  número: ");
			numero = total.nextInt();

			if (numero % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}

		System.out.println("Total de números pares: " + pares);
		System.out.println("Total de números ímpares: " + impares);

		total.close();

	}

}
