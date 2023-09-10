import java.util.Random;
import java.util.Scanner;

public class ExJava22 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(100) + 1;
        int palpite;

        System.out.println("Vamos jogar?");

        do {
            System.out.print("Tente adivinhar o número entre 1 a 100: ");
            palpite = scanner.nextInt();

            if (palpite < numeroAleatorio | palpite > numeroAleatorio) {
                System.out.println("Não foi dessa vez! \n Tente denovo!");
            }
            else {
                System.out.println("Parabéns! Você acertou o número " + numeroAleatorio);
            }
        } while (palpite != numeroAleatorio);

        scanner.close();
    }
}
