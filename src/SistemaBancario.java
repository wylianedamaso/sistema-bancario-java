import java.util.Scanner;
// Sistema Bancário simples para fins de aprendizado em Java.
// Permite consultar saldo, depositar, sacar e sair do programa.
public class SistemaBancario {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double saldo = 0; //Guarda o valor do saldo atual do usuário.
        int opcao = 0; //Armazenará a opção escolhida no menu.

        //Loop principal do menu, onde continua até que o usuário escolha sair(opção 4).
        while (opcao != 4){
            System.out.println("\n===============================");
            System.out.println("         MENU BANCÁRIO         ");
            System.out.println("===============================");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");
            System.out.println("===============================\n");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt(); //Lê a opção escolhida pelo usuário.
            scanner.nextLine(); //Evita problemas de buffer ao ler entrada numérica.

           //Executa a ação escolhida pelo usuário de acordo com a opção do menu.
            switch (opcao){
                case 1:
                    System.out.println("Seu saldo é: R$" + saldo); //Exibe o saldo atual do usuário.
                    break;

                case 2:
                    System.out.println("\n=== DEPÓSITO ===");
                    System.out.println("Informe o valor que deseja depositar: R$");
                    double valorDeposito = scanner.nextDouble();
                    if (valorDeposito <= 0){ //Verifica se o valor é positivo para realizar o depósito.
                        System.out.println("Valor inválido para depósito.");
                    }
                    else {
                        saldo += valorDeposito;
                        System.out.println("Seu saldo atual é de R$" + saldo);  //Atualiza o saldo apenas se o valor for válido.
                    }
                    break;

                case 3:
                    System.out.println("\n=== SAQUE ===");
                    System.out.println("Informe o valor que deseja sacar: R$");
                    double valorSaque = scanner.nextDouble();
                    if (valorSaque > saldo){ //Verifica se o usuário tem saldo suficiente antes de realizar o saque.
                        System.out.println("Você não possui saldo suficiente para o saque solicitado.");
                    }
                    else {
                        saldo -= valorSaque; //Subtrai o valor do saldo após a validação.
                        System.out.println("Seu saldo atual é de R$" + saldo);
                    }

                    break;

                case 4:
                    System.out.println("Saindo..."); //Mensagem ao usuário antes de encerrar o programa.
                    break;
                default:
                    System.out.println("Opção inválida!"); //Mensagem para o usuário, caso digite uma opção inexistente.



            }


        }

    }
}