import java.util.Scanner;

public class Declaração_Variáveis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome:");
        String usuariao = sc.nextLine();

        System.out.print("Digite sua idade:");
        int idadeUsuario = sc.nextInt();

        System.out.print("Digite sua altura:");
        double pesousuario = sc.nextDouble();

        boolean ligado = false;
        boolean temPermissao = true;

        if (temPermissao) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado!");
        }

    }
}
