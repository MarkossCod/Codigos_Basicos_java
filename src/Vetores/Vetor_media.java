package Vetores;

import java.util.Scanner;

public class Vetor_media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        int soma = 0;
        double media;

        for (int i = 0; i < num.length; i++) {
            System.out.print("Digite o valor da " + (i + 1) + "ª nota: ");
            num[i] = sc.nextInt();
            soma += num[i];
        }

        media = soma / 5.0;
        System.out.println("Média das notas: " + media);

        sc.close();
    }
}
