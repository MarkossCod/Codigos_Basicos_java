import java.util.Scanner;

public class Conversao_Temperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite a temperatura em Celsius: ");
        double temp1 = sc.nextDouble();


        System.out.print("Digite a temperatura em Fahrenheit: ");
        double temp2 = sc.nextDouble();


        double conv = temp1 * 1.8 + 32;
        System.out.println("A temperatura " + temp1 + "°C convertida para Fahrenheit é: " + conv + "°F");


        double convfaren = (temp2 - 32) / 1.8;
        System.out.println("A temperatura " + temp2 + "°F convertida para Celsius é: " + convfaren + "°C");

        sc.close();
    }
}
