import java.util.Scanner;
public class ExJava10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Escreva seu nome:");
        String nome = scanner.next();
        System.out.println("Escreva quantas vezes seu nome será repetido:");
        int vezes = scanner.nextInt();

        while (0 < vezes ) {
            vezes--;
            System.out.println(nome);
        }
    scanner.close();
    }
}