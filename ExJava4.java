import java.util.Scanner;

public class ExJava4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a porcentagem do IPI a ser acrescido: ");
        double ipi = scanner.nextDouble();

        System.out.print("Digite o código da peça 1: ");
        String codPc1 = scanner.next();

        System.out.print("Digite o valor unitário da peça 1: ");
        double valorPc1 = scanner.nextDouble();

        System.out.print("Digite a quantidade de peças 1: ");
        int qtdPc1 = scanner.nextInt();


        System.out.print("Digite o código da peça 2: ");
        String codPc2 = scanner.next();

        System.out.print("Digite o valor unitário da peça 2: ");
        double valorPc2 = scanner.nextDouble();

        System.out.print("Digite a quantidade de peças 2: ");
        int qtdPc2 = scanner.nextInt();

        System.out.println("Valor total a ser pago: " + (valorPc1 * qtdPc1 + valorPc2 * qtdPc2) * (ipi / 100 + 1));

        scanner.close();
    }
}
