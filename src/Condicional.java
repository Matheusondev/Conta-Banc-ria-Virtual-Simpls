import java.util.Scanner;

public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 1986;
          boolean incluidoNoPlano = false;
           double notaDoFilme = 8.1;
            String tipoPlano = "plus";
        if(anoDeLancamento >= 2022){
            System.out.println("Recente");
        } else {
            System.out.println("Filmes retrô que vale a pena assistir!");
        }
        if (incluidoNoPlano == true && tipoPlano.equals("plus")) {
            System.out.println("Filme liberado, pode assistir!");
        } else {
            System.out.println("Deve alugar, pois o seu plano não é suficiente e/ou não está incluído no plano");
        }
    }
}
