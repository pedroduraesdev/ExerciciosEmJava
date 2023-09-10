import  java.util.Scanner;
public class ExJava12_13_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int i = 1;
        int maior = 0;
        while (i <= 20) {
            System.out.println("Escreva a idade de 20 pessoas:");
            int valor = scanner.nextInt();
            soma += valor;
            i++;

            if (valor >= 18) {
                maior++;
            }
        }
        System.out.println("A soma da idade das 20 pessoas é: " + soma);
        System.out.println("A média da idade das 20 pessoas é: " + soma/20);
        System.out.println("Um total de: " + maior + " é maior de idade.");
        scanner.close();
    }
}
