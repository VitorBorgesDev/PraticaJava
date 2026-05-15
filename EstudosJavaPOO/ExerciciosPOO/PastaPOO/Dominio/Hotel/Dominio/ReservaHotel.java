package LogicaJava.PastaPOO.Dominio.Hotel.Dominio;

public class ReservaHotel {
    private hospedeHotel hospedeHotel;
    private Quarto quarto;
    private int noites;

    public ReservaHotel(hospedeHotel hospedeHotel, Quarto quarto, int noites) {
        this.hospedeHotel = hospedeHotel;
        this.quarto = quarto;
        this.noites = noites;
    }

    public double calculaTotal() {
        return quarto.getPrecoPorNoite() * noites;
    }

    public void confirmarReserva() {
        quarto.Reservar();
    }

    public int getNoites() {
        return noites;

    }

    public Quarto getQuarto() {
        return quarto;
    }
}




