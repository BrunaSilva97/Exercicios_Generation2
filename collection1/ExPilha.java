package collection1;

import java.util.*;

public class ExPilha {

	public static void main(String[] args) {
		 
		 Scanner scanner = new Scanner(System.in);
	        Stack<String> pilhaLivros = new Stack<>();
	        int opcao;

	        do {
	            // Exibindo o menu de opções
	            System.out.println("***************************");
	            System.out.println("1: Adicionar livro na pilha");
	            System.out.println("2: Listar todos os livros");
	            System.out.println("3: Retirar livro da pilha");
	            System.out.println("0: Sair");
	            System.out.println("***************************");
	            System.out.print("Entre com a opção desejada: ");
	            opcao = scanner.nextInt();
	            scanner.nextLine(); // Consumir a nova linha após o nextInt()

	            switch (opcao) {
	                case 1:
	                    // Adicionar um novo livro
	                    System.out.print("\nDigite o nome do livro: ");
	                    String nomeLivro = scanner.nextLine();
	                    pilhaLivros.push(nomeLivro);
	                    System.out.println("\nLivro " + nomeLivro + " adicionado à pilha.");
	                    break;

	                case 2:
	                    // Listar todos os livros da pilha
	                    if (pilhaLivros.isEmpty()) {
	                        System.out.println("\nA pilha está vazia.");
	                    } else {
	                        System.out.println("\nLivros na pilha: " + pilhaLivros);
	                    }
	                    break;

	                case 3:
	                    // Retirar o livro do topo da pilha
	                    if (pilhaLivros.isEmpty()) {
	                        System.out.println("\nA pilha está vazia.");
	                    } else {
	                        String livroRetirado = pilhaLivros.pop();
	                        System.out.println("\n O Livro " + livroRetirado + " foi retirado da pilha.");
	                    }
	                    break;

	                case 0:
	                    // Finalizar o programa
	                    System.out.println("\nPrograma finalizado.");
	                    break;

	                default:
	                    System.out.println("\nOpção inválida. Tente novamente.");
	                    break;
	            }
	        } while (opcao != 0);

	        scanner.close();

	}

}
