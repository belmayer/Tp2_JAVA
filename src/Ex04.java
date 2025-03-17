import java.time.LocalDate;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o dia do seu aniversario: ");
        int dia = sc.nextInt();
        System.out.println("digite o mes: ");
        int mes = sc.nextInt();
        System.out.println("digite o ano: ");
        int ano = sc.nextInt();

        LocalDate hoje = LocalDate.now();
        LocalDate aniv = LocalDate.of(ano, mes, dia);

        long diasVividos = hoje.toEpochDay() - aniv.toEpochDay();

        System.out.println("vc viveu a seguinte quantidade em dias: "+ diasVividos);


    }
}
