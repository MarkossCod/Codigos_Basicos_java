import java.util.Scanner;
import java.util.Random;

public class Jogo_Adivinhacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("== JOGO DE ADIVINHAR O NÚMERO ==");

        // Gera número aleatório entre 1 e 100
        int numeroSecreto = random.nextInt(100) + 1;
        int tentativa = 0;
        int palpite = 0;

        // Repete até o usuário acertar
        while (palpite != numeroSecreto) {
            System.out.print("Digite um número de 1 a 100: ");
            palpite = sc.nextInt();
            tentativa++;

            if (palpite < numeroSecreto) {
                System.out.println("O número secreto é MAIOR!");
            } else if (palpite > numeroSecreto) {
                System.out.println("O número secreto é MENOR!");
            } else {
                System.out.println("Parabéns! Você acertou o número secreto " + numeroSecreto + "!");
                System.out.println("Tentativas: " + tentativa);
            }
        }
        sc.close();
    }
}
