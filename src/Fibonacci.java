import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantos termos da sequência Fibonacci você quer: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("Digite um número maior que 0.");
        } else {
            long a = 0, b = 1;

            System.out.print("Sequência de Fibonacci: ");
            for (int i = 0; i < num; i++) {
                System.out.print(a + " ");
                long proximo = a + b;
                a = b;
                b = proximo;
            }
            System.out.println();
        }
        sc.close();
    }
}