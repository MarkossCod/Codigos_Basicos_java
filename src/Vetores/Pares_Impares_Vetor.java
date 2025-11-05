package Vetores;

import java.util.Scanner;

public class Pares_Impares_Vetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];

        // Leitura dos números
        for (int i = 0; i < num.length; i++) {
            System.out.print("Digite um valor para o número " + (i + 1) + ": ");
            num[i] = sc.nextInt();
        }

        // Contadores iniciam em 0
        int pares = 0;
        int impares = 0;

        // Verifica se cada valor é par ou ímpar
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        // Exibe os resultados
        System.out.println("\nQuantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);

        sc.close();
    }
}
