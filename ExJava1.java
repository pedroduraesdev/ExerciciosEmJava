import java.util.Scanner;

public class ExJava1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Qual a quantidade de dias tem sua idade? Vamos descobrir!");

        System.out.println("Digite sua idade em anos:");
        int ano = scanner.nextInt ();

        System.out.println("Digite a quantidade de meses:");
        int meses = scanner.nextInt();

        System.out.println("Digite a quantidade de dias:");
        int dias = scanner.nextInt();

        System.out.println("Totalizando: " + (ano*360 + meses*30 + dias) + " dias." );

        scanner.close();
    }
}