package LogicaJava.exerciciosDePOO.Dominio.ContaBancaria.Main;

import LogicaJava.exerciciosDePOO.Dominio.ContaBancaria.Dominio.ContaBancaria;

public class ContaBancariaMain {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Vitor", 1000, 15733);
        ContaBancaria conta2 = new ContaBancaria("Angelo", 5600, 15577);



        System.out.println("-------------------");
        conta1.depositar(6000);
        conta1.sacar(4500);
        conta1.transferencia(600, conta2);
        System.out.println("-------------------");

        conta2.depositar(500);
        conta2.sacar(3500);
        conta2.transferencia(1500, conta1);

        System.out.println("\n=== SALDOS FINAIS ===");

        System.out.println(conta1.getTitularConta() + ": " + conta1.getSaldo());

        System.out.println(conta2.getTitularConta() + ": " + conta2.getSaldo());





    }
}
