package collection1;

import java.util.*;

public class ExFila {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Queue<String> filaClientes = new LinkedList<>();
        int opcao;

        do {
            System.out.println("****************************");
            System.out.println("1: Adicionar Cliente na fila");
            System.out.println("2: Listar todos os Clientes");
            System.out.println("3: Retirar cliente da fila");
            System.out.println("0: Sair");
            System.out.println("****************************");
            System.out.print("Digite uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome: ");
                    String nomeCliente = scanner.nextLine();
                    filaClientes.add(nomeCliente);
                    System.out.println("Cliente adicionado à fila.\n");
                    break;

                case 2:
                    if (filaClientes.isEmpty()) {
                        System.out.println("A fila está vazia.\n");
                    } else {
                        System.out.println("Clientes na fila: " + filaClientes + "\n");
                    }
                    break;

                case 3:
                    if (filaClientes.isEmpty()) {
                        System.out.println("A fila está vazia.\n");
                    } else {
                        String clienteChamado = filaClientes.poll();
                        System.out.println("Cliente foi chamado.\n");
                    }
                    break;

                case 0:
                    System.out.println("Programa finalizado.\n");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.\n");
                    break;
            }
        } while (opcao != 0);

        scanner.close();

	}

}
