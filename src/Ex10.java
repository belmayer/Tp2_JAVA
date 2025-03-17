import java.util.*;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aleatorio = new Random().nextInt(100) + 1;
        int chute;

        System.out.println("tente acertar o numero entre 1 e 100: ");

        do {
            System.out.print("seu chute: ");
            chute = scanner.nextInt();

            if (chute < aleatorio) System.out.println("maior");
            else if (chute > aleatorio) System.out.println("menor");

        } while (chute != aleatorio);

        System.out.println("uuuu acertou finalmente!!!!");
    }
}
