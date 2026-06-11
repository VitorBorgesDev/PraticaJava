package LogicaJava.exerciciosDePOO.Dominio.ContaBancaria.Dominio.Menu;

import LogicaJava.exerciciosDePOO.Dominio.ContaBancaria.Dominio.Login;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Menu {

    Scanner input = new Scanner(System.in);


    Login loginUsuario;
    ContaBancaria contaBancaria = new ContaBancaria();
    LocalDateTime dataExtrato = LocalDateTime.now();


    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");


    public void iniciarMenu() throws InterruptedException {
        boolean continuar = true;


        if (loginUsuario == null) {
            System.out.println("-----BEM VINDO A O MELHOR BANCO-----");
            System.out.println("Por favor faço o login");

            System.out.println("Digite o seu nome: ");
            String nomeUsuario = input.nextLine();

            System.out.println("Digite seu CPF: ");
            String cpf = input.nextLine();

            System.out.println("Só um momento...");
            Thread.sleep(1500);


            System.out.println("BEM VINDO!!! " + nomeUsuario);
            loginUsuario = new Login(nomeUsuario, cpf);

        }


        do {
            System.out.println("-----------BEM-VINDO----------");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Tranferência");
            System.out.println("4. Ver Extrato");
            System.out.println("0. Sair");

            int opcaoEscolhida = input.nextInt();

            switch (opcaoEscolhida) {
                case 1:
                    System.out.println("Digite o valor a ser depositado: ");
                    double valorDepositado = input.nextDouble();
                    contaBancaria.depositar(valorDepositado);
                    break;


                case 2:
                    System.out.println("Digite o valor a ser sacado: ");
                    double valorSacado = input.nextDouble();
                    contaBancaria.sacar(valorSacado);
                    break;


                case 3:
                    System.out.println("Digite o número da conta de destino: ");
                    int numeroDestino = input.nextInt();
                    ContaBancaria contaDestino = new ContaBancaria(0,  numeroDestino);
                    System.out.println("Digite o valor a transferir: ");
                    double valorTransferir = input.nextDouble();
                    System.out.println("Transferência realizada com sucesso!!");
                    contaBancaria.transferir(contaDestino, valorTransferir);
                    break;


                case 4:
                    contaBancaria.verExtrato();
                    break;


                case 0:
                    Thread.sleep(1500);
                    System.out.println("Saindo...");
                    continuar = false;
                    break;



                default:
                    System.out.println("Opção inválida");


            }


        } while (continuar);


    }


}
