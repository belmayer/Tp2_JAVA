import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um valor em reais: ");
        double reais = input.nextDouble();

        double dolar = reais / 5.82;

        System.out.printf("o valor convertido para dolares é: %.2f", dolar);
    }
}
