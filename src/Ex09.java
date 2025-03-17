import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("cadastre uma senha: ");
        String senhaCadastrada = scanner.nextLine();

        String confirmacao = "";

        while (!confirmacao.equals(senhaCadastrada)) {
            System.out.println("confirme sua senha: ");
            confirmacao = scanner.nextLine();

            if (!confirmacao.equals(senhaCadastrada)) {
                System.out.println("incorreta, digite novamente.");
            }
        }
        System.out.println("muito bem!");
    }
}
