import java.util.Scanner;

public class Operacoes_Matematicas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero1 = sc.nextDouble();

        System.out.print("Digite outro número: ");
        double numero2 = sc.nextDouble();

        double soma = numero1 + numero2;
        System.out.println("A soma dos números digitados é de: " + soma);

        double subtracao = numero1 - numero2;
        System.out.println("A subtração dos números digitados é de: " + subtracao);

        double multiplicacao = numero1 * numero2;
        System.out.println("A multiplicação dos números digitados é de: " + multiplicacao);

        if (numero1 == 0 || numero2 == 0) {
            System.out.println("Valor inserido igual a 0. Não é possível dividir.");
        } else {
            double divisao = numero1 / numero2;
            System.out.println("A divisão dos números digitados é de: " + divisao);
        }

        sc.close();
    }
}
