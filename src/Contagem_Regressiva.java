import java.util.Scanner;

public class Contagem_Regressiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero para ver a sua contagem regressiva: ");
        int num = sc.nextInt();

        System.out.println("A contagem regressiva do número: "+num+" é: ");
        for(int i = num; i >=0; i--){
            System.out.println(i);

        }


    }
}
