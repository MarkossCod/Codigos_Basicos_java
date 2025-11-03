import java.util.Scanner;

public class Tabuada_completa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite --quero ver-- para prosseguir: ");
        String op = sc.nextLine();

        if (op.equals("quero ver")) {
            for (int num = 1; num <= 10; num++) {           // para cada número de 1 a 10
                System.out.println("Tabuada do " + num + ":");
                for (int i = 1; i <= 10; i++) {             // multiplica de 1 a 10
                    int multi = num * i;
                    System.out.println(num + " x " + i + " = " + multi);
                }
                System.out.println();
            }
        } else {
            System.out.println("Comando inválido.");
            System.out.println("Tente novamente!!");
        }

        sc.close();
    }
}
