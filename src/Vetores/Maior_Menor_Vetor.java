package Vetores;

import java.util.Scanner;

public class Maior_Menor_Vetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];

        for (int i = 0; i < num.length; i++) {
            System.out.print("Digite um valor para o número "+(i+1)+" :");
            num[i] = sc.nextInt();
        }
        double maior = num[0];
        double menor = num[0];

        // Percorre o vetor para encontrar maior e menor
        for (int i = 1; i < 10; i++) {
            if (num[i] > maior) {
                maior = num[i];
            } else if(num[i] < menor) {
                menor = num[i];
            }
        }

        // Mostra o resultado
        System.out.println("\nMaior valor: " + maior);
        System.out.println("Menor valor: " + menor);

        sc.close();
    }
}
