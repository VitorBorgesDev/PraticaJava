package LogicaJava.exerciciosDePOO.Dominio.locadoraDeCarro.Dominio;

import java.util.ArrayList;

public class Locadora {
    private ArrayList<Carro> carros;


    public Locadora() {
        carros = new ArrayList<>();
    }

    public void adicionarCarro(Carro carro) {
        carros.add(carro);
    }

    public void listarCarrosDisponiveis() {
        boolean encontrou = false;

        for (Carro carro : carros) {
            if (!carro.isAlugado()) {
                encontrou = true;
                System.out.println("---------------");
                System.out.println("Modelo: " + carro.getModeloCarro());
                System.out.println("Ano: " + carro.getAnoCarro());
                System.out.println("Placa: " + carro.getPlacaCarro());
                System.out.println("Valor por dia: R$ " + carro.getValorPorDia());
                System.out.println("---------------");

            }
            if (!encontrou) {
                System.out.println("Nenhum carro encontrado!");
            }
        }

    }


    public Carro buscaCarroPorPlaca(String placaCarro) {
        for (Carro carro : carros) {
            if (carro.getPlacaCarro().equals(placaCarro)) {
                System.out.println("Carro encontrado ");
                System.out.println("-------------------------");
                System.out.println("Modelo: " + carro.getModeloCarro());
                System.out.println("Placa: " + carro.getPlacaCarro());
                System.out.println("Valor por dia: R$ " + carro.getValorPorDia());
                System.out.println("-------------------------");
                return carro;
            }
        }

        return null;
    }




}



