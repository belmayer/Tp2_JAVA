import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("digite o valor da compra : ");
        double valor = sc.nextDouble();
        double desconto = valor;

        if (valor > 1000) {
            desconto = valor * 0.9;
            System.out.println("preco com o desconto: " + desconto);

        }else if (valor <= 1000 && valor > 500 ) {
            desconto = valor * 0.95;
            System.out.println("preco com o desconto: " + desconto);
        }else {
            System.out.println("nao há desconto");
        }

    }
}
