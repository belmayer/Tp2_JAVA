import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("escolha um número para começar a PA: ");
        int numero = scanner.nextInt();

        System.out.println("valor da razão: ");
        int razao = scanner.nextInt();

        if (razao <= 0) {
            System.out.println("digite um número maior que zero.");
            return;
        }

        System.out.println("sequência personalizada por vc até chegar no 100:");

        String sequencia = "";
        while (numero <= 100) {
            sequencia += numero + ", ";
            numero += razao;
        }

        if (!sequencia.isEmpty()) {
            sequencia = sequencia.substring(0, sequencia.length() - 2);
        }
        System.out.println(sequencia);
    }
}
