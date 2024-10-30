/*
Para doar sangue é necessário ter entre 18 e 69 anos de idade. 
Pessoas com idade entre 60 e 69 anos, só podem doar se não for a sua primeira doação. 
Escreva um Algoritmo em Java que obtenha via teclado o 
nome do doador (String), a idade (inteiro) do doador e se é a primeira doação (boolean). 
De acordo com as Regras para a doação, mostre na tela se o doador está Apto ou Não Apto para doar sangue.
*/

package lacos.condiconais;

import java.util.Scanner;

public class Lista1Exercicio3 {

	public static void main(String[] args) {

		String nome;
		int idade;
		boolean primeiraDoacao;

		Scanner verificação = new Scanner(System.in);

		System.out.println("Digite o nome do doador: ");
		nome = verificação.nextLine();

		System.out.println("Digite a idade do doador: ");
		idade = verificação.nextInt();

		System.out.println("É a primeira doação de sangue? (true ou false): ");
		primeiraDoacao = verificação.nextBoolean();

		if (idade >= 18 && idade <= 69) {
			if (idade < 60) {
				System.out.println(nome + " está apto(a) para doar sangue!");
			} else {
				if (primeiraDoacao == false) {
					System.out.println(nome + " está apto(a) para doar sangue!");
				} else {
					System.out.println(nome + " não está apto(a) para doar sangue!");
				}
			}
		} else {
			System.out.println(nome + " não está apto(a) para doar sangue!");
		}
	}
}
