import java.util.Scanner;

public class ExJava21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int numero;

        System.out.println("Digite uma sequência de números! \n(Digite um número negativo para cancelar):");

        while (true) {
            numero = scanner.nextInt();

            if (numero < 0) {
                break;
            }

            soma += numero;
        }

        System.out.println("A soma dos números é: " + soma);

        scanner.close();
    }
}
