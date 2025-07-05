import java.util.Random;
import java.util.Scanner;

public class Adivinhação {
    public static void main(String[] args) {
        int numeroAleatorio = new Random().nextInt(100);
        Scanner leitura = new Scanner(System.in);
        int tentativas = 0;
        int numero = 0;

        for (int i = 0; i < 100; i++) {
            System.out.println("Qual número você chuta entre 1 a 100?");
            numero = leitura.nextInt();
            tentativas++;
            if (numero == numeroAleatorio){
                System.out.println("Você acertou o número! Parabéns!, com " + tentativas + " tentativas");
                break;
            } else if(numero > numeroAleatorio) {
                System.out.println("O número aleatório é menor que o número digitado.");
            } else if (numero < numeroAleatorio) {
                System.out.println("O número aleatório é maior que o número digitado.");
            }
        }

        System.out.println("O número era " + numeroAleatorio);
    }
}
