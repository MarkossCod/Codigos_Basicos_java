import java.util.Scanner;

public class Par_Impar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double num1 = sc.nextDouble();

        if (num1/2==0){
            System.out.println("O número "+num1+" é PAR!");
        } else {
            System.out.println("O número "+num1+" é ÍMPAR!");
        }
    sc.close();
    }
}
