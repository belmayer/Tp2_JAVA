import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.println("digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        System.out.println("digite a quarta nota: ");
        double nota4 = sc.nextDouble();


        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("sua media é: " + media);

        if (media >= 7) {
            System.out.println("Aprovado!");
        }
        else if (media >= 5 && media <= 6.9) {
            System.out.println("Recuperação!");
        }
        else {
            System.out.println("Reprovado!");
        }

    }
}
