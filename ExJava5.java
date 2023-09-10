import java.util.Scanner;
public class ExJava5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de um salário mínimo:");
        int sm = scanner.nextInt();

        System.out.println("Digite o salário que você recebe:");
        double smUsuario = scanner.nextDouble();

        System.out.println("Você recebe um total de " + (smUsuario/sm) + " salários minímos.");

        scanner.close();
    }
}
