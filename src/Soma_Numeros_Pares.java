import java.util.Scanner;

public class Soma_Numeros_Pares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        int soma = 0;

        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }

        System.out.println("A soma dos números pares de 0 até " + num + " é: " + soma);
        sc.close();
    }
}
