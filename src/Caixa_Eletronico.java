import java.util.Scanner;

public class Caixa_Eletronico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicita o valor desejado
        System.out.print("Digite o valor a ser sacado: ");
        int valor = sc.nextInt();

        // Cálculo da quantidade de notas
        int notas100 = valor / 100;
        valor = valor % 100;

        int notas50 = valor / 50;
        valor = valor % 50;

        int notas20 = valor / 20;
        valor = valor % 20;

        int notas10 = valor / 10;
        valor = valor % 10;

        int notas5 = valor / 5;
        valor = valor % 5;

        // Exibe o resultado
        System.out.println("Notas de 100: " + notas100);
        System.out.println("Notas de 50: " + notas50);
        System.out.println("Notas de 20: " + notas20);
        System.out.println("Notas de 10: " + notas10);
        System.out.println("Notas de 5: " + notas5);

        sc.close(); // Fecha o Scanner
    }
}
