import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("primeiro lado: ");
        int lado1 = scanner.nextInt();

        System.out.println("segundo lado: ");
        int lado2 = scanner.nextInt();

        System.out.println("terceiro lado: ");
        int lado3 = scanner.nextInt();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Isósceles");
            } else {
                System.out.println("Escaleno");
            }
        } else {
            System.out.println("não existe triangulo com essas medidas de lados");
        }
    }
}
