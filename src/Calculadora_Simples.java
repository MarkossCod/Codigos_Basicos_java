import java.util.Scanner;

public class Calculadora_Simples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite outro número: ");
        double num2 = sc.nextDouble();

        sc.nextLine(); // Limpa o buffer antes de ler a operação

        System.out.print("Digite a operação matemática que você gostaria de realizar (+, -, /, *): ");
        String op = sc.nextLine();

        if (op.equals("+")) {
            double soma = num1 + num2;
            System.out.println("A soma dos números digitados é: " + soma);

        } else if (op.equals("-")) {
            double subtracao = num1 - num2;
            System.out.println("A subtração dos números digitados é: " + subtracao);

        } else if (op.equals("*")) {
            double multiplicacao = num1 * num2;
            System.out.println("A multiplicação dos números digitados é: " + multiplicacao);

        } else if (op.equals("/")) {
            if (num2 == 0) {
                System.out.println("Não é possível dividir por zero.");
            } else {
                double divisao = num1 / num2;
                System.out.println("A divisão dos números digitados é: " + divisao);
            }

        } else {
            System.out.println("Operação inválida!");
        }

        sc.close();
    }
}
