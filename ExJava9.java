import java.util.Scanner;
public class ExJava9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Escreva seu nome:");
        String nome = scanner.next();

        for (int i = 1; i <= 10; i++) {
            System.out.println(nome);
        }
        scanner.close();
    }
}