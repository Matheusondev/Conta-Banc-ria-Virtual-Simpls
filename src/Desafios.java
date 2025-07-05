import java.util.Scanner;

public class Desafios {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double valorTransferir = 0;
        double saldoInicial = 2500.00;

        System.out.println("""
                 **************************************
                 Dados do cliente:
                
                 Nome:         Sandra
                 Tipo conta:   Corrente
                 Saldo:        R$: 2500,00
                
                ****************************************
                """);

        System.out.println("""
                Operações
                
                1 - Consultar Saldo
                2 - Receber Valor
                3 - Transferir Valor
                4 - Sair
                
                ****************************************
                """);
        while (5 == 5) {
            System.out.println("""
                    
                    Digite a operação desejada:
                    """);
            int operacao = leitura.nextInt();
            if (operacao == 1) {
                System.out.println(String.format("O seu saldo atual é de " + saldoInicial));
            } else if (operacao == 2) {
                System.out.println("Digite o valor que quer receber:");
                double valorReceber = leitura.nextDouble();
                saldoInicial = saldoInicial + valorReceber;
                System.out.println("Seu saldo atual é de: " + saldoInicial);
            } else if (operacao == 3) {
                System.out.println("Digite o valor que quer transferir:");
                valorTransferir = leitura.nextDouble();
                if (valorTransferir > saldoInicial) {
                    System.out.println("Você não tem saldo para isso.");
                } else{
                    saldoInicial = saldoInicial - valorTransferir;
                    System.out.println("Seu saldo atual é de: " + saldoInicial);}
            } if (operacao == 4) {
                break;
            }


        }
    }
}