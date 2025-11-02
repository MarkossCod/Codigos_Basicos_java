import java.util.Scanner;

public class Contador_de_pares_impares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = sc.nextInt();

        int pares = 0;
        int impares = 0;

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);
        sc.close();
    }
}
