package br.com.wyliane.banco;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldo){
        this.saldo = saldo;

    }

    public double consultarSaldo(){
        return saldo;
    }

    public void depositar(double valorDeposito){
        if (valorDeposito <= 0){
            System.out.println("Valor inválido para depósito.");
            return;
        }
        saldo += valorDeposito;
        System.out.printf("Depósito realizado com sucesso. Saldo atual: R$ %.2f%n", saldo);
    }

    public void sacar(double valorSaque){
        if (valorSaque <= 0) {
            System.out.println("Valor inválido.");
            return;
        }

        if (valorSaque > saldo) {
            System.out.println("Você não possui saldo suficiente para o saque solicitado.");
            return;
        }

        saldo -= valorSaque;
        System.out.printf("Saque realizado com sucesso. Saldo atual: R$ %.2f%n", saldo);

    }

}
