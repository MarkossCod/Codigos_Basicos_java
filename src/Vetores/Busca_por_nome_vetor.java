package Vetores;

import java.util.Scanner;

public class Busca_por_nome_vetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[10];

        // Entrada dos nomes
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome do usuário " + (i + 1) + ": ");
            nomes[i] = sc.nextLine();
        }

        String opcao;

        // Loop de repetição para permitir várias buscas
        do {
            // Solicita o nome a ser buscado
            System.out.print("\nDigite o nome que deseja buscar: ");
            String busca = sc.nextLine();

            // Verifica se o nome está na lista
            boolean encontrado = false;
            int posicao = -1;

            for (int i = 0; i < nomes.length; i++) {
                if (nomes[i].equalsIgnoreCase(busca)) {
                    encontrado = true;
                    posicao = i;
                    break;
                }
            }

            if (encontrado) {
                System.out.println("\n✅ O nome \"" + busca + "\" está na lista (posição " + posicao + ").");
            } else {
                System.out.println("\n❌ O nome \"" + busca + "\" NÃO está na lista.");
            }

            // Pergunta se o usuário deseja fazer outra busca
            System.out.print("\nDeseja buscar outro nome? (sim/não): ");
            opcao = sc.nextLine();

        } while (opcao.equalsIgnoreCase("sim")); // repete enquanto o usuário quiser

        System.out.println("\nPrograma finalizado !!");
        sc.close();
    }
}
