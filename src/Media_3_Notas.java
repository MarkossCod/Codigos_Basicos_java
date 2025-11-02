import java.util.Scanner;

public class Media_3_Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da sua primeira nota: ");
        Double nota1 = sc.nextDouble();

        System.out.print("Digite o valor da sua segunda nota: ");
        Double nota2 = sc.nextDouble();

        System.out.print("Digite o valor da sua terceira nota: ");
        Double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;
        if (media >= 7) {
            System.out.println("Valor da média das três notas é: "+media+" Aluno aprovado");
        } else {
            System.out.println("Valor da média das três notas é: "+media+" Aluno Reprovado");
        }
    sc.close();
    }
}
