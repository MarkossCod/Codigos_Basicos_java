import java.util.Scanner;

public class Maior_de_Dois_Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        System.out.print("Digite outro numero: ");
        int num2 = sc.nextInt();

        if (num > num2) {
            System.out.println("Número "+num+" é o maior número digitado!");
        }else {
            System.out.println("Número "+num2+" é o maior número digitado!");
        }

    }
}
