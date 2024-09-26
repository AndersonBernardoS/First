import java.util.Scanner;
public class ContaBancaria {
    public static void main(String[] args) {
        String nome = "Anderson";
        String tipoConta = "Corrente";
        double saldo = 2500.00;
        int movimentacao;
        int opcoes = 0;

        System.out.println("***********************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo Conta: " + tipoConta);
        System.out.println("Saldo Inicial: " + saldo);
        System.out.println("***********************");

        Scanner scanner = new Scanner(System.in);

        while (opcoes != 4) {
            System.out.println("""
                    Operações
                    
                    1- Consultar saldos
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                    
                    Digite a opção desejada:
                    """
            );
            opcoes = scanner.nextInt();

            if (opcoes == 1) {
                System.out.println("Seu saldo atual é: R$ " + String.format("%.2f", saldo));
            } else if (opcoes == 2) {
                System.out.println("Qual o valor deseja receber?: ");
                movimentacao = scanner.nextInt();
                saldo += movimentacao;
                System.out.println("Agora, seu saldo atual é de R$ " + saldo);
            } else if (opcoes == 3) {
                System.out.println("Qual o valor deseja transferir?: ");
                movimentacao = scanner.nextInt();
                if (movimentacao < saldo) {
                    saldo -= movimentacao;
                    System.out.println("Agora, seu saldo atual é de R$ " + String.format("%.2f", saldo));
                } else {
                    System.out.println("Não há saldo para realizar a transferência.");
                }
            } else if (opcoes != 4) {
                System.out.println("Opção inválida!");
            }
        }
    }
}