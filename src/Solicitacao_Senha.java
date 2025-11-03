import java.util.Scanner;

public class Solicitacao_Senha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean senhaValida = false; // flag para controlar o loop

        System.out.println("== Seja Bem-vindo ==");

        // Enquanto a senha não for válida, continue pedindo
        while (!senhaValida) {
            System.out.print("Digite a sua senha para logar no app: ");
            String senha = sc.nextLine();

            // Verifica se o tamanho está entre 6 e 8 caracteres
            if (senha.length() >= 6 && senha.length() <= 8) {

                // Verifica se contém pelo menos um caractere especial
                if (senha.matches(".*[!@#$%&*_].*")) {  // Regex para caractere especial
                    System.out.println("Senha válida! Você está logado.");
                    senhaValida = true; // encerra o loop
                } else {
                    System.out.println("Senha inválida! Sua senha precisa conter pelo menos um caractere especial (!@#$%&*_)");
                }

            } else {
                System.out.println("Senha inválida! Sua senha deve ter entre 6 a 8 caracteres.");
            }

            System.out.println();
        }

        sc.close();
    }
}
//Foi implementado atras do chatgpt o loop de repetição(while), para trazer uma melhor experiencia para o usuario!