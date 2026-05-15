package LogicaJava.PastaPOO.Dominio.Hotel.Dominio;


// quarto
public class Quarto {
    private int numeroQuarto;
    private String tipoQuarto;
    private boolean ocupado;
    private double precoPorNoite;

    public Quarto(int numeroQuarto, String tipoQuarto, boolean ocupado, double precoPorNoite) {
        this.numeroQuarto = numeroQuarto;
        this.tipoQuarto = tipoQuarto;
        this.ocupado = ocupado;
        this.precoPorNoite = precoPorNoite;
    }

    public void Reservar() {
        if (ocupado == false) {
            ocupado = true;
            System.out.println("Reservado com sucesso!");
        } else {
            System.out.println("quarto ja ocupado!!");
        }
    }

    public void liberar() {
        if (ocupado == true) {
            ocupado = false;
            System.out.println("Quarto indisponível!");
        } else{
            System.out.println("quarto ja ocupado!");
        }

    }

    public double getPrecoPorNoite() {
        return precoPorNoite;
    }

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public String getTipoQuarto() {
        return tipoQuarto;
    }

    public void mostrarInformacoes() {
        System.out.println("Quarto numero: " + this.numeroQuarto);
        System.out.println("Quarto tipo: " + this.tipoQuarto);
        System.out.println("Quarto ocupado: " + ocupado);

    }
}