package LogicaJava.PastaPOO.Dominio.Hotel.Dominio.Menu;

import LogicaJava.PastaPOO.Dominio.Hotel.Dominio.Quarto;

import java.util.ArrayList;


public class Hotel {
  private ArrayList<Quarto> quartos;


  public Hotel() {
      quartos = new ArrayList<>();
  }

    public void adicionarQuarto(Quarto quarto) {
        quartos.add(quarto);
        System.out.println("Quarto adicionado com sucesso!!");
    }

    public void listaQuartosDisponiveis() {
        boolean encontrou = false;

        for (Quarto quarto : quartos) {
            if (!quarto.isOcupado()) {
                quarto.mostrarInformacoes();
                encontrou = true;
            }

            if (!encontrou) {
                System.out.println("Nenhum quarto encontrado!");
            }

        }

    }

    public Quarto buscarQuartoPorNumero(int numero) {
        for (Quarto quarto : quartos) {
            if (quarto.getNumeroQuarto() == numero) {
                return quarto;

            }
        }
        return null;
    }

    public void listaQuartosPorCategoria(String categoria) {
        boolean encontrou = false;


        for (Quarto quarto : quartos) {

            if (quarto.getTipoQuarto().equalsIgnoreCase(categoria)) {
                quarto.mostrarInformacoes();
                encontrou = true;

            }
            if (!encontrou) {
                System.out.println("Nenhum quarto encontrado!");
            }
        }
    }


    public void mostrarInformacoesPorCategoria() {

    }
}
