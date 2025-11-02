import java.util.Scanner;

public class Num_Positivo_Negativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite  um número: ");
        int num = sc.nextInt();

        if (num==0){
            System.out.println("Número digitado é Neutro!");
        } else if (num<0) {
            System.out.println("Número digitado é negativo!");
        } else {
            System.out.println("Número digitado é positivo!");
        }
    sc.close();
    }
}
