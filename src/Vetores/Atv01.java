package Vetores;

import java.util.Scanner;
import java.util.Arrays;

public class Atv01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];

        for (int i=0; i<num.length; i++){
            System.out.print("Digite o valor um número "+(i+1)+" :");
            num[i]= sc.nextInt();
        }
        System.out.println("\nNúmeros digitados: " + Arrays.toString(num));
        sc.close();
    }
}
