package Vetores;

import java.util.Scanner;

public class Dobro_valor_Vetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];

        for (int i = 0; i < num.length; i++) {
            System.out.print("Digite um valor para o número "+(i+1)+" :");
            num[i] = sc.nextInt();
        }

        int[] dobrado = new int[5];
        for (int i = 0; i < 5; i++) {
            dobrado[i] = num[i] * 2;
        }

        System.out.println("\nValores dobrados:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Número "+(i+1)+": "+dobrado[i]);
        }

    sc.close();
    }
}
