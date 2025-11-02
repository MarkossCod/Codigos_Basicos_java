import java.util.Scanner;

public class Conversor_Moeda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor em reais:");
        double valor = sc.nextDouble();

        System.out.print("Digite a opção que você gostaria de converter (1-Euro/2-Dolar): ");
         int op = sc.nextInt();

        double taxaEuro = 6.20;
        double taxaDolar = 5.60;

        if (op==1){
             double conv= valor/taxaEuro;
            System.out.printf("Valor: R$%.2f convertido para euro é de: €%.2f%n", valor, conv);
         } else if (op==2){
             double conv= valor/taxaDolar;
            System.out.printf("Valor: R$%.2f convertido para dólar é de: US$%.2f%n", valor, conv);
         } else {
             System.out.println("Opção inválida !!");
         }
         sc.close();
    }
}
