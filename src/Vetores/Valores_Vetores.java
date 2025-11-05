package Vetores;

import java.util.Scanner;

public class Valores_Vetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num1 = new int[5];
        int[] num2 = new int[5];

        for (int i = 0; i < num1.length; i++) {
            System.out.print("Digite um valor para o vetor 1, posição " + (i + 1) + ": ");
            num1[i] = sc.nextInt();
        }

        for (int i = 0; i < num2.length; i++) {
            System.out.print("Digite um valor para o vetor 2, posição " + (i + 1) + ": ");
            num2[i] = sc.nextInt();
        }

        // Terceiro vetor com o tamanho da soma dos dois primeiros
        int[] num3 = new int[num1.length + num2.length];

        // Copiando os valores do num1 para num3
        for (int i = 0; i < num1.length; i++) {
            num3[i] = num1[i];
        }

        // Copiando os valores do num2 para num3
        for (int i = 0; i < num2.length; i++) {
            num3[num1.length + i] = num2[i];
        }

        System.out.println("\nConteúdo do terceiro vetor (junção dos dois anteriores):");
        for (int valor : num3) {
            System.out.print(valor + " ");
        }

        sc.close();
    }
}
