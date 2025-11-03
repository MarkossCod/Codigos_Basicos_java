import java.util.Scanner;

public class Maior_Menor_Entre_Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quando números você quer digitar: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("Quantidade inválida!");
            sc.close();
            return;
        }

        System.out.print("Digite o 1º número: ");
        int numero = sc.nextInt();
        int maior = numero;
        int menor = numero;

        for (int i = 2; i <= num; i++) {
            System.out.print("Digite o " + i + "º número: ");
            numero = sc.nextInt();

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("\n O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);

        sc.close();
    }
}
