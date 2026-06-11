package LogicaJava.ExerciciosCompletos.Completos.ContaBancaria.Dominio.Menu;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {
    private double saldo;
    private int numeroConta;
    private List<String> extrato = new ArrayList<>();
    private DateTimeFormatter dataHoraExtrato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");


    public ContaBancaria(double saldoInicial, int numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public ContaBancaria(String nome, double saldo, int numeroConta, DateTimeFormatter dataExtrato) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.dataHoraExtrato = dataHoraExtrato;
    }

    public ContaBancaria() {
    }


    public void depositar(double valorDepositado) {
        if (valorDepositado > 0) {
            this.saldo += valorDepositado;
            System.out.printf("Você depositou R$ %.2f%n ", valorDepositado);
            System.out.printf("Saldo atual: R$ %.2f%n ", this.saldo);
            registrarExtrato("Depósito: R$ " + valorDepositado + " | Saldo: R$ " + saldo);

        } else {
            System.out.println("Valor inválido");
        }

    }

    public void sacar(double valorSacado) {
        if (valorSacado > 0 && saldo >= valorSacado) {
            saldo -= valorSacado;
            System.out.printf("Saque realizado com sucesso no valor de R$ %.2f%n ", valorSacado);
            System.out.printf("Saldo atual: R$ %.2f%n " , saldo);
            registrarExtrato("Saque: R$ " + valorSacado + " | Saldo: R$ " + saldo);

        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void registrarExtrato(String descricao) {
        String dataHora = LocalDateTime.now().format(dataHoraExtrato);
        extrato.add("[" + dataHora + "]" + descricao);

    }


// Preciso de alguns ajustes
    public void transferir(ContaBancaria contaDestino, double valorTransferencia) {
        if (valorTransferencia > 0 && saldo >= valorTransferencia) {
            saldo -= valorTransferencia;

            contaDestino.saldo += valorTransferencia;

            String descricaoOrigem = "Transferência enviada enviada de R$" + valorTransferencia
                    + " para conta " + contaDestino.numeroConta + " | Saldo: R$ " + saldo;

            String descricaoDestino = "Transferência recebida de R$" + valorTransferencia
                    + " da conta " + this.numeroConta + " | Saldo: R$ " + contaDestino.saldo;


            registrarExtrato(descricaoOrigem);
            contaDestino.registrarExtrato(descricaoDestino);
            System.out.printf("Transferência de R$ %.2f%n ", valorTransferencia , " realizada com sucesso!");


        } else {
            System.out.printf("Saldo insuficiente ou valor inválido");
        }


    }

    public void verExtrato() {
        if (extrato.isEmpty()) {
            System.out.println("Nenhuma movimentação encontrada.");

        } else {
            System.out.println("========= EXTRATO =========");
            for (String linha : extrato) {
                System.out.println(linha);
            }
            System.out.printf("Saldo atual: R$ %.2f%n ", saldo);
            System.out.println("===========================");
        }
    }

    public int getNumeroConta() {
        return numeroConta;
    }
}






