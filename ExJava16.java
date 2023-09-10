import java.util.Scanner;

public class ExJava16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número e veja a tabuada dele:");
        int valor = scanner.nextInt();
        System.out.println("Aqui a está a tabuada do número: " + valor);

        for (int i = 1; i <=10; i++){
            System.out.println(i + " x " + valor + "= " + (i*valor) );
        }
        scanner.close();
    }
}
