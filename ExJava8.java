public class ExJava8 {
    public static void main(String[] args) {
        int i = 1;
        int soma = 0;

        while (i <= 15) {
            soma += i;
            i++;
        }

        System.out.println("A soma dos números 1 a 15 é: " + soma);
    }
}