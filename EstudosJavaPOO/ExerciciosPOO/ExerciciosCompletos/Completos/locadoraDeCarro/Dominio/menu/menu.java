package LogicaJava.ExerciciosSimples.Incompletos.locadoraDeCarro.Dominio.menu;

import LogicaJava.ExerciciosSimples.Incompletos.locadoraDeCarro.Dominio.Carro;
import LogicaJava.ExerciciosSimples.Incompletos.locadoraDeCarro.Dominio.AluguelPrincipal;
import LogicaJava.ExerciciosSimples.Incompletos.locadoraDeCarro.Dominio.Login.Cliente;
import LogicaJava.ExerciciosSimples.Incompletos.locadoraDeCarro.Dominio.Locadora;

import java.util.Scanner;

public class menu {
    Scanner sc = new Scanner(System.in);
    Locadora locadora;
    Cliente clienteLogado;
    AluguelPrincipal aluguelAtual;

    public void iniciarMenuCarro() {
        boolean continuar = true;
        if (locadora == null) {
            locadora = new Locadora();

            Carro carro1 = new Carro("HB20", "AAB123", 2021, 100);
            Carro carro2 = new Carro("Corolla", "AAC122", 2026, 180);
            Carro carro3 = new Carro("Civic", "AAD124", 2024, 140);
            Carro carro4 = new Carro("Onix", "AAAE121", 2022, 150);
            Carro carro5 = new Carro("Elantra", "ABE131", 2026, 280);


            locadora.adicionarCarro(carro1);
            locadora.adicionarCarro(carro2);
            locadora.adicionarCarro(carro3);
            locadora.adicionarCarro(carro4);
            locadora.adicionarCarro(carro5);


        }

        if (clienteLogado == null) {
            System.out.println("Seu nome: ");
            String nome = sc.nextLine();


            System.out.println("Seu CPF: ");
            int cpf = sc.nextInt();
            sc.nextLine();

            System.out.println("Seu numero para contato: ");
            String numero = sc.nextLine();

            clienteLogado = new Cliente(nome, cpf, numero);

        }

        do {
            System.out.println("----------MENU----------");
            System.out.println("1. Ver carros disponíveis");
            System.out.println("2. Alugar carro");
            System.out.println("3. Devolver carro");
            System.out.println("4. Ver resumo");
            System.out.println("5. Sair");

            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    locadora.listarCarrosDisponiveis();
                    break;


                case 2:

                    System.out.println("digite a placa do carro");
                    String placa = sc.next();

                    System.out.println("quantas dias?");
                    int quantasDias = sc.nextInt();

                    Carro carroEscolhido = locadora.buscaCarroPorPlaca(placa);
                    if (carroEscolhido == null) {
                        System.out.println("Nenhum carro encontrado");
                        break;

                    } else {
                        aluguelAtual = new AluguelPrincipal(
                                clienteLogado,
                                carroEscolhido,
                                quantasDias
                        );
                        aluguelAtual.confirmarAluguel();
                    }
                    break;

                case 3:

                    if (aluguelAtual != null) {

                        System.out.println(
                                "Pretende devolver o carro "
                                        + aluguelAtual.getCarro().getModeloCarro()
                                        + " de placa "
                                        + aluguelAtual.getCarro().getPlacaCarro()
                                        + " ? (s/n)"
                        );

                        String resposta = sc.next();

                        if (resposta.equalsIgnoreCase("s")) {
                            aluguelAtual.devolverAluguel();
                        } else {
                            System.out.println("Devolução cancelada.");
                        }

                    } else {
                        System.out.println("Você não possui aluguel ativo.");
                    }

                    break;

                case 4:

                    if (aluguelAtual != null) {
                        System.out.println("--------- RESUMO DO ALUGUEL ---------");
                        System.out.println("Cliente: " + aluguelAtual.getCliente().getNome());
                        System.out.println("Carro: " + aluguelAtual.getCarro().getModeloCarro());
                        System.out.println("Placa: " + aluguelAtual.getCarro().getPlacaCarro());
                        System.out.println("Dias alugados: " + aluguelAtual.getDias());
                        System.out.println("Valor por dia: R$ " + aluguelAtual.getCarro().getValorPorDia());
                        System.out.println("Valor total: R$ " + aluguelAtual.calcularTotal());
                        System.out.println("-------------------------------");

                    } else {
                        System.out.println("Nenhum aluguel ativo.");
                    }

                    break;

                case 5:
                    System.out.println("Saindo do sistema...");
                    continuar = false;
                    break;


            }


        } while (continuar);


    }


}
