import java.util.Scanner;
/* Sistema Bancário simples para fins de aprendizado em Java.
 * Permite consultar saldo, depositar, sacar e sair do programa.
 */
public class SistemaBancario {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        int opcao = 0;

        //Loop principal do menu, onde continua até que o usuário escolha sair(opção 4).
        while (opcao != 4) {
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
            opcao = scanner.nextInt();
            scanner.nextLine(); //Evita problemas de buffer ao ler entrada numérica.

            switch (opcao) {
                case 1:
                    System.out.printf("Saldo atual: R$ %.2f%n", saldo);
                    break;

                case 2:
                    System.out.println("""
                    === DEPÓSITO ===
                    Informe o valor que deseja depositar: R$
                    """);
                    double valorDeposito = scanner.nextDouble();
                    if (valorDeposito <= 0) {
                        System.out.println("Valor inválido para depósito.");
                    } else {
                        saldo += valorDeposito;
                        System.out.printf("Seu saldo atual é de R$ %.2f%n", saldo);
                    }
                    break;

                case 3:
                    System.out.println("""
                    === SAQUE ===
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