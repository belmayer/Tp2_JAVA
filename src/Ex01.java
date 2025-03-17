import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = sc.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o nome da sua mae: ");
        String nomeMae = sc.nextLine();

        System.out.println("Digite o nome do seu pai: ");
        String nomePai = sc.nextLine();

        System.out.println("\n" + nomeCompleto + "\n" + idade + "\n" + nomeMae + "\n" + nomePai + "\n");

        if(nomeCompleto.length() > nomeMae.length()) {
            System.out.println("o nome do usuario é maior que o da mae");
        } else{
            System.out.println("o nome do usuario é menor que o da mae");
        }
        if(nomeCompleto.length() > nomePai.length()) {
            System.out.println("o nome do usuario é maior que o do pai");
        } else{
            System.out.println("o nome do usuario é menor que o do pai");
        }

    }
}
