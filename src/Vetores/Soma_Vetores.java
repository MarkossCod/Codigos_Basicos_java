package Vetores;

import java.util.Scanner;

public class Soma_Vetores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        int soma=0;

        for (int i=0; i<num.length; i++){
            System.out.print("Digite o valor do numero "+(i+1)+" :");
            num[i]= sc.nextInt();
            soma+= num[i];
        }
        System.out.println("A soma dos números digitados é: "+soma);
        sc.close();
    }
}
