import java.util.Scanner;

public class Potencia_Numero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da base: ");
        int base = sc.nextInt();

        System.out.print("Digite o valor do expoente: ");
        int expoente = sc.nextInt();

        double resultado = 1;

        if (expoente >= 0) {
            // Calcula base^expoente para expoente positivo
            for (int i = 0; i < expoente; i++) {
                resultado *= base;
            }
        } else {
            // Calcula base^expoente para expoente negativo (ex: 2^-3 = 1 / (2^3))
            for (int i = 0; i < -expoente; i++) {
                resultado *= base;
            }
            resultado = 1 / resultado;
        }

        // Exibe resultado formatado
        if (resultado % 1 == 0) {
            System.out.println(base + " elevado a " + expoente + " = " + (int) resultado);
        } else {
            System.out.println(base + " elevado a " + expoente + " = " + resultado);
        }

        sc.close();
    }
}
