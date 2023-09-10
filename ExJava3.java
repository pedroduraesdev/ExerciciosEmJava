import java.util.Scanner;
public class ExJava3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Digite seu saldo bancário:");
        int saldo = scanner.nextInt();

        System.out.println("Seu saldo com reajuste de 1% é: " + (saldo + (saldo*0.01)));
    }
}
