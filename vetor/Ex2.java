package ex.vetor;

public class Ex2 {

	public static void main(String[] args) {
		int i;
		int vetor[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int soma = 0;
		double media;

		// impares
		System.out.print("Elementos nos índices ímpares: \n");
		for (i = 1; i < 10; i += 2) {
			System.out.print(vetor[i] + " ");
		}
		System.out.print("\n");

		// pares
		System.out.print("\nElementos pares: \n");
		for (i = 0; i < 10; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.print(vetor[i] + " ");
			}
		}
		System.out.print("\n");

		// soma
		for (i = 0; i < 10; i++) {
			soma += vetor[i];
		}
		System.out.println("\nSoma: \n" + soma + "\n");

		// media
		media = (soma / 10.0);
		System.out.println("Média: \n" + String.format("%.2f", media));

	}

}
