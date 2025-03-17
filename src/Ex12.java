import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite uma frase:");
        String frase = scanner.nextLine().trim();

        if (frase.isEmpty()) {
            System.out.println("frase vazia, escreva outra");
            return;
        }

        String[] palavras = frase.split("\\s+");
        int contador = palavras.length;

        System.out.println("A frase contém " + contador + " palavras.");

    }
}
