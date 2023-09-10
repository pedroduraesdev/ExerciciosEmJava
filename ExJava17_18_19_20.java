import java.util.Scanner;
public class ExJava17_18_19_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int i = 1;
        int maior = 0;
        int pares = 0;
        int intervalo1 = 0;
        int intervalo2 = 0;
        int intervalo3 = 0;

        while (i <= 20) {
            System.out.println("Escreva 20 números aleátorios:");
            int valor = scanner.nextInt();
            soma += valor;
            i++;

            if (valor > 8) {
                maior++;
            }
            if (valor % 2 == 0) {
                pares++;
            }
            if (valor >= 0 && valor <= 100) {
                intervalo1 ++;
            } else if (valor >= 101 && valor <= 200) {
                intervalo2 ++;
            } else if (valor > 200) {
                intervalo3 ++;
            }

        }
        System.out.println(maior + " números são maiores que 8.");
        System.out.println(pares + " são pares.");
        System.out.println(intervalo1 + " números estão entre 0 e 100.");
        System.out.println(intervalo2 + " números estão entre 101 e 200.");
        System.out.println(intervalo3 + " são maiores que 200.");

        scanner.close();
    }
}
