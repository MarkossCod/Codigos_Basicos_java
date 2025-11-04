package Vetores;

import java.util.Scanner;

public class Pares_Impares_Vetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];

        for (int i = 0; i < num.length; i++) {
            System.out.print("Digite um valor para o número "+(i+1)+" :");
            num[i] = sc.nextInt();
        }

    }

}
