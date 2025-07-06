import java.util.Scanner;

public class Desafios {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double valorTransferir = 0;
        double saldoInicial = 2500.00;
        int operacao = 0;
        System.out.println("""
                 **************************************
                 Dados do cliente:
                
                 Nome:         Matheus //your name
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
        while (operacao != 4) {
            System.out.println("""
                    Digite a operação desejada:
                    """);
            operacao = leitura.nextInt();
            switch (operacao) {
                case 1:
                    System.out.println("Seu saldo atual é de: " + saldoInicial);
                    break;
                case 2:
                    System.out.println("Digite o quanto quer receber:");
                    double valorReceber = leitura.nextDouble();
                    saldoInicial += valorReceber;
                    System.out.println("Seu saldo atual é de: " + saldoInicial);
                    break;
                case 3:
                    System.out.println("Digite o quanto quer transfeir:");
                    valorTransferir = leitura.nextDouble();
                    if (valorTransferir > saldoInicial){
                        System.out.println("Você não tem saldo suficiente");
                    } else {
                        saldoInicial -= valorTransferir;
                    }
                    System.out.println("Seu saldo atual é de: " + saldoInicial);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    return;
            }
        }
    }
}
