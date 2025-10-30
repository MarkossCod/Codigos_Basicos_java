import java.util.Scanner;

public class Soma_simples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite um número: ");
        double numero1 = sc.nextDouble();

        System.out.printf("Digite outro número: ");
        double numero2 = sc.nextDouble();

        double soma= numero1+numero2;

        System.out.print("A soma dos números digitados é de: "+soma);


    }
}
