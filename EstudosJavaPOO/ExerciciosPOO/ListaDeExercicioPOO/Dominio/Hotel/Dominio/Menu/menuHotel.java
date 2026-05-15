
package LogicaJava.ListaDeExercicioPOO.Dominio.Hotel.Dominio.Menu;

import LogicaJava.ListaDeExercicioPOO.Dominio.Hotel.Dominio.Quarto;
import LogicaJava.ListaDeExercicioPOO.Dominio.Hotel.Dominio.ReservaHotel;
import LogicaJava.ListaDeExercicioPOO.Dominio.Hotel.Dominio.hospedeHotel;


import java.util.Scanner;

public class menuHotel {

    Scanner entrada = new Scanner(System.in);
    ReservaHotel reservaAtual;
    hospedeHotel loginHospede;
    Hotel hotel;
    Quarto quarto;


    public void iniciarMenuHotel() {

        boolean continuar = true;
        if (hotel == null) {
            hotel = new Hotel();

            Quarto quarto1 = new Quarto(101, "Simples", false, 150);
            Quarto quarto2 = new Quarto(102, "Luxo", false, 350);
            Quarto quarto3 = new Quarto(110, "Premium", false, 550);
            Quarto quarto4 = new Quarto(103, "Premium", false, 550);
            Quarto quarto5 = new Quarto(104, "Luxo", false, 350);

            hotel.adicionarQuarto(quarto1);
            hotel.adicionarQuarto(quarto2);
            hotel.adicionarQuarto(quarto3);
            hotel.adicionarQuarto(quarto4);
            hotel.adicionarQuarto(quarto5);
        }

        if (loginHospede == null) {
            System.out.println("Digite o seu nome: ");
            String nome = entrada.nextLine();


            System.out.println("Digite o seu cpf: ");
            String cpf = entrada.nextLine();


            loginHospede = new hospedeHotel(nome, cpf);
        }

        do {
            System.out.println("--------MENU--------");
            System.out.println("1. Mostrar quartos disponíveis");
            System.out.println("2. Ver categorias");
            System.out.println("3. Reservar quarto");
            System.out.println("4. Mostrar resumo");
            System.out.println("5. Sair");
            int opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    hotel.listaQuartosDisponiveis();
                    break;

                case 2:
                    entrada.nextLine();
                    System.out.println("Digite  categoria desejada:  Simples, Premium ou Luxo: ");
                    String categoria = entrada.nextLine();
                    hotel.listaQuartosPorCategoria(categoria);
                    break;

                case 3:
                    System.out.println("Digite o numero do quarto: ");
                    int quartoId = entrada.nextInt();

                    Quarto quartoEscolhido = hotel.buscarQuartoPorNumero(quartoId);

                    if (quartoEscolhido == null) {
                        System.out.println("Quarto não encontrado");

                    } else {
                        System.out.println("digite quantas noites vai precisar: ");
                        int quantasNoites = entrada.nextInt();

                        reservaAtual = new ReservaHotel(
                                loginHospede,
                                quartoEscolhido,
                                quantasNoites
                        );

                        reservaAtual.confirmarReserva();

                        System.out.println("quarto reservado com sucesso!!");
                    }
                    break;

                case 4:

                    if (reservaAtual == null) {
                        System.out.println("Você ainda não fez nenhuma reserva");
                    } else {
                        System.out.println("------------informações do usuario------------");
                        System.out.println("Nome do hospede: " + loginHospede.getNome());
                        System.out.println("CPF do hospede: " + loginHospede.getCpf());

                        System.out.println("-------------RESUMO DA RESERVA------------");
                        System.out.println("Numero do quarto: "
                                + reservaAtual.getQuarto().getNumeroQuarto());

                        System.out.println("Tipo do quarto: "
                                + reservaAtual.getQuarto().getTipoQuarto());

                        System.out.println("Preço por noite: R$ "
                                + reservaAtual.getQuarto().getPrecoPorNoite());

                        System.out.println("Quantidade de noites: "
                                + reservaAtual.getNoites());

                        System.out.println("------------------------------------");
                        System.out.println("Valor total: " + reservaAtual.calculaTotal());
                    }
                    break;

                case 5:
                    System.out.println("Saindo do sistema...");
                    continuar = false;
                    break;

                default: System.out.println("Opção inválida");
            }
        } while (continuar);
    }
}



