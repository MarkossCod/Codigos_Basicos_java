package Vetores;

import java.util.Scanner;

public class Ordem_invertida_vetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[8];

        // Lê os valores do usuário
        for (int i = 0; i < num.length; i++) {
            System.out.print("Digite um valor para o número " + (i + 1) + ": ");
            num[i] = sc.nextInt();
        }

        // Exibe os números em ordem inversa
        System.out.println("\nA ordem invertida dos números digitados é:");
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.println(num[i]);
        }

        sc.close();
    }
}
