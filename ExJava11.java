import java.util.Scanner;
public class ExJava11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int i = 1;
        while (i <= 10) {
            System.out.println("Escreva 10 número e veja a soma deles:");
            int valor = scanner.nextInt();
            soma += valor;
            i++;
        }
        System.out.println("A soma dos número é: " + soma);
        scanner.close();
    }
}
