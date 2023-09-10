import java.util.Scanner;

public class ExJava6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int valor = scanner.nextInt();

        System.out.println("Seu número é: " + valor );
        System.out.println("O antecessor do seu número é: " + (valor - 1) );
        System.out.println("O sucessor do seu número é: " + (valor + 1) );

        scanner.close();
    }
}
