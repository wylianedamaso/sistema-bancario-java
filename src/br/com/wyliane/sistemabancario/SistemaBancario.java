package br.com.wyliane.sistemabancario;
import br.com.wyliane.banco.ContaBancaria;
import java.util.InputMismatchException;
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

    // Metodo principal responsável por controlar o fluxo do sistema bancário
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria(0);

        int opcao = 0;

        //Loop principal do menu, onde continua até que o usuário escolha sair(opção 4).
        while (opcao != 4) {
            exibirMenu();

            try {
                opcao = scanner.nextInt();
                scanner.nextLine(); //Evita problemas de buffer ao ler entrada numérica.
            } catch (InputMismatchException e){
                System.out.println("Entrada inválida! Digite apenas números.");
                scanner.nextLine(); //Limpa entrada errada
                continue;
            }

            switch (opcao) {

                case 1:

                    System.out.printf("Saldo atual: R$ %.2f%n", conta.consultarSaldo());
                    break;

                case 2:
                    System.out.println("""
                    ==== DEPÓSITO ====
                    Informe o valor que deseja depositar: R$""");
                    try {
                        double valorDeposito = scanner.nextDouble();
                        conta.depositar(valorDeposito);
                    } catch (InputMismatchException e){
                        System.out.println("Entrada inválida! Digite um valor numérico.");
                        scanner.nextLine();
                    }
                    break;

                case 3:
                    System.out.println("""
                    ==== SAQUE ====
                    Informe o valor que deseja sacar: R$""");

                    try {
                        double valorSaque = scanner.nextDouble();
                        conta.sacar(valorSaque);
                    } catch (InputMismatchException e){
                        System.out.println("Entrada inválida! Digite um valor numérico.");
                        scanner.nextLine();
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