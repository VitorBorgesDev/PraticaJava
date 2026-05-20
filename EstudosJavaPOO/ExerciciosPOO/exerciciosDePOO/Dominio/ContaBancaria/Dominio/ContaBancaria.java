package LogicaJava.exerciciosDePOO.Dominio.ContaBancaria.Dominio;

public class ContaBancaria {

    private String titularConta;
    private double saldo;
    private int numeroConta;

    public ContaBancaria(String nome, double saldo, int numeroConta) {
        this.numeroConta = numeroConta;
        this.titularConta = nome;
        this.saldo = saldo;
    }

    public void depositar(double valorDepositado) {

        if (valorDepositado > 0) {
            this.saldo += valorDepositado;

            System.out.println("Você depositou " + valorDepositado);

        } else {
            System.out.println("Valor inválido");
        }
    }

    public void sacar(double valorSacado) {

        if (valorSacado > 0 && saldo >= valorSacado) {

            this.saldo -= valorSacado;

            System.out.println("Saque realizado com sucesso no valor de " + valorSacado);

        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void transferencia(double valorTransferencia, ContaBancaria contaDestino) {

        if (valorTransferencia > 0 && saldo >= valorTransferencia) {

            contaDestino.saldo += valorTransferencia;
            this.saldo -= valorTransferencia;

            System.out.println("Transferência realizada com sucesso no valor de "
                    + valorTransferencia
                    + " para a conta de "
                    + contaDestino.titularConta);

        } else {
            System.out.println("Valor inválido ou saldo insuficiente");
        }
    }

    public String getTitularConta() {

        return titularConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setTitularConta(String titularConta) {
        this.titularConta = titularConta;
    }
}