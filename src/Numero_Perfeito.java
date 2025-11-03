import java.util.Scanner;

public class Numero_Perfeito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para verificar se é perfeito: ");
        int num = sc.nextInt();

        int soma = 0;

        // Encontrar divisores próprios (de 1 até num-1)
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                soma += i;
            }
        }

        if (soma == num) {
            System.out.println(num + " é um número perfeito.");
        } else {
            System.out.println(num + " não é um número perfeito.");
        }

        sc.close();
    }
}
