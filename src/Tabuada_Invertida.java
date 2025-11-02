import java.util.Scanner;

public class Tabuada_Invertida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero para ver a sua tabuada ao inverso: ");
        int num1 = sc.nextInt();

        for (int i = 10; i >= 1; i--) {
            int multi = num1 * i;
            System.out.println(num1 + " x " + i + " = " + multi);
        }

        sc.close();
    }
}
