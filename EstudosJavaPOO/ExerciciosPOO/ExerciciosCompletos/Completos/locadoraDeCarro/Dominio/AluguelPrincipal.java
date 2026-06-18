package LogicaJava.ExerciciosSimples.Incompletos.locadoraDeCarro.Dominio;

import LogicaJava.ExerciciosSimples.Incompletos.locadoraDeCarro.Dominio.Login.Cliente;

public class AluguelPrincipal {
    private Cliente cliente;
    private Carro carro;
    private int dias;


    public AluguelPrincipal(Cliente cliente, Carro carro, int dias) {
        this.cliente = cliente;
        this.carro = carro;
        this.dias = dias;
    }


    public double calcularTotal() {
        return carro.getValorPorDia() * dias;

    }

    public void confirmarAluguel() {
        carro.alugar();
    }

    public void devolverAluguel() {
        carro.devolver();
    }

    public Carro getCarro() {
        return carro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getDias() {
        return dias;
    }
}
