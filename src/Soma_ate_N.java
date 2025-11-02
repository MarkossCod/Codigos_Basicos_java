import java.util.Scanner;

public class Soma_ate_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = sc.nextInt();

        int soma = 0;
        for (int i = 1; i <= num1; i++) {
            soma += i;
        }

        System.out.println("A soma dos números de 1 até " + num1 + " é: " + soma);

        sc.close();
    }
}
