package Vetores;

import java.util.Scanner;

public class apenas_numeros_positivos_vetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];

        for (int i = 0; i < num.length; i++) {
            System.out.print("Digite um valor para o número "+(i+1)+" :");
            num[i] = sc.nextInt();
        }

        System.out.println("\nNúmeros positivos digitados:");
        for (int i = 0; i < 10; i++) {
            if (num[i] > 0) {
                System.out.println("Número "+(i+1)+": "+num[i]);
            }
        }
        sc.close();

    }
}
