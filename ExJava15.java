import java.util.Scanner;

public class ExJava15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeMaisNova = null;
        int idadeMaisNova = Integer.MAX_VALUE; // Inicializa com um valor muito grande

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o nome da pessoa " + i + ": ");
            String nome = scanner.nextLine();

            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            if (idade < idadeMaisNova) {
                idadeMaisNova = idade;
                nomeMaisNova = nome;
            }
        }

        scanner.close();

        if (nomeMaisNova != null) {
            System.out.println("A pessoa mais nova é: " + nomeMaisNova);
            System.out.println("Idade: " + idadeMaisNova + " anos");
        } else {
            System.out.println("Nenhum dado foi inserido.");
        }
    }
}

