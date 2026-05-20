package LogicaJava.exerciciosDePOO.Dominio.locadoraDeCarro.Dominio;

public class Carro {

    private String modeloCarro;
    private String placaCarro;
    private int anoCarro;
    private double valorPorDia;
    private boolean alugado;


    public Carro(String modeloCarro, String placaCarro, int anoCarro, double valorPorDia) {
        this.modeloCarro = modeloCarro;
        this.placaCarro = placaCarro;
        this.anoCarro = anoCarro;
        this.valorPorDia = valorPorDia;
        this.alugado = false;
    }


    public void alugar() {
        if (alugado == false) {
            alugado = true;
            System.out.println("Carro alugado com  sucesso!!!!");
        } else {
            System.out.println("Carro indisponivel para alugel");
        }

    }

    public void devolver() {
        if (alugado) {
            alugado = false;
            System.out.println("Carro devolvido com sucesso!");
        } else {
            System.out.println("Carro ja devolvido/disponivel");
        }
    }


    public String getModeloCarro() {
        return modeloCarro;
    }

    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    public String getPlacaCarro() {
        return placaCarro;
    }

    public void setPlacaCarro(String placaCarro) {
        this.placaCarro = placaCarro;
    }

    public int getAnoCarro() {
        return anoCarro;
    }

    public void setAnoCarro(int anoCarro) {
        this.anoCarro = anoCarro;
    }

    public boolean isAlugado() {
        return alugado;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }

    public double getValorPorDia() {
        return valorPorDia;
    }

    public void setValorPorDia(double valorPorDia) {
        this.valorPorDia = valorPorDia;
    }

    public void calcularTotal() {
    }
}
