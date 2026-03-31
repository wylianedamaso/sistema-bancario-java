import java.util.Scanner;
/* Sistema Bancário simples para fins de aprendizado em Java.
 * Permite consultar saldo, depositar, sacar e sair do programa.
 */
public class SistemaBancario {
    // Exibe o menu principal do sistema bancário
    public static void exibirMenu(){
        System.out.println("""
            ===============================
                     MENU BANCÁRIO
            ===============================
            1 - Consultar Saldo
            2 - Depositar
            3 - Sacar
            4 - Sair
            ===============================
            Escolha uma opção:
            """);
    }
    // Mostra o saldo atual da conta
    public static void consultarSaldo(double saldo){
        System.out.printf("Saldo atual: R$ %.2f%n", saldo);

    }
    // Realiza um depósito e retorna o novo saldo atualizado
    public static double depositar(double saldo , Scanner scanner){
        System.out.println("""
         ==== DEPÓSITO ====
         Informe o valor que deseja depositar: R$
         """);

        double valorDeposito = scanner.nextDouble();

        if (valorDeposito <= 0) {
            System.out.println("Valor inválido para depósito.");
        } else {
            saldo += valorDeposito;
            System.out.printf("Seu saldo atual é de R$ %.2f%n", saldo);
        }
        return saldo;
    }
    // Realiza um saque caso haja saldo suficiente e retorna o saldo atualizado
    public static double sacar(double saldo, Scanner scanner){
        System.out.println("""
         ==== SAQUE ====
         Informe o valor que deseja sacar: R$
         """);
        double valorSaque = scanner.nextDouble();
        if(valorSaque <= 0) {
            System.out.println("Valor inválido");
        }
        else if (valorSaque > saldo) {
            System.out.println("Você não possui saldo suficiente para o saque solicitado.");
        } else {
            saldo -= valorSaque;
            System.out.printf("Seu saldo atual é de R$ %.2f%n", saldo);
        }
        return saldo;
    }
    // Metodo principal responsável por controlar o fluxo do sistema bancário
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        int opcao = 0;

        //Loop principal do menu, onde continua até que o usuário escolha sair(opção 4).
        while (opcao != 4) {
            exibirMenu();

            opcao = scanner.nextInt();
            scanner.nextLine(); //Evita problemas de buffer ao ler entrada numérica.

            switch (opcao) {

                case 1:
                    consultarSaldo(saldo);
                    break;

                case 2:
                    saldo = depositar(saldo, scanner);
                    break;

                case 3:
                    saldo= sacar(saldo, scanner);
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
         scanner.close();
    }
}