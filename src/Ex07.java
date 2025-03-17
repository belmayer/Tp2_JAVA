import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("qual o seu salário bruto anual? ");
        double bruto = scanner.nextDouble();

        double imposto = 0;

        if (bruto <= 13000) {
            imposto = 0;
        } else if (bruto <= 35000) {
            imposto = (bruto - 13000) * 0.075;
        } else if (bruto <= 41000) {
            imposto = (35000 - 13000) * 0.075 + (bruto - 35000) * 0.15;
        } else if (bruto <= 57000) {
            imposto = (35000 - 13000) * 0.075 + (41000 - 35000) * 0.15 + (bruto - 41000) * 0.225;
        } else {
            imposto = (35000 - 13000) * 0.075 + (41000 - 35000) * 0.15 + (57000 - 41000) * 0.225 + (bruto - 57000) * 0.275;
        }

        double liquido = bruto - imposto;


        System.out.println("vc precisa pagar: R$ " + imposto);
        System.out.println("seu salário líquido anual é: R$ " + liquido);

    }
}
