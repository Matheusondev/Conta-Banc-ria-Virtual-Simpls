import java.util.Scanner;

public class Main{
    public static void main(String[]args){
       double precoOriginal = 100;
       double desconto = 10;
               double calculoDesconto = (desconto / precoOriginal) * 100;
       double totalJaDescontado = precoOriginal - calculoDesconto;
        System.out.println(totalJaDescontado);
    }
}