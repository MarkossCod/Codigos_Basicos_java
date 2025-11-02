import java.util.Scanner;

public class Num_Primo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para verificar se é primo: ");
        int numero = sc.nextInt();

        if (numero <= 1) {
            System.out.println(numero + " não é primo.");
        } else {
            boolean primo = true;

            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                System.out.println(numero + " é um número primo.");
            } else {
                System.out.println(numero + " não é um número primo.");
            }
        }

        sc.close();
    }
}
