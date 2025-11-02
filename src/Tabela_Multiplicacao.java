import java.util.Scanner;

public class Tabela_Multiplicacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero para ver a sua tabuada: ");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int multi = num * i;
            System.out.println(num + " x " + i + " = " + multi);
        }

        sc.close();
    }
}
