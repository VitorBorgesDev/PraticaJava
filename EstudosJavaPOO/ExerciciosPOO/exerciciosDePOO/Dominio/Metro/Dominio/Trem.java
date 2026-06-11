package LogicaJava.exerciciosDePOO.Dominio.Metro.Dominio;

public class Trem {
    private String nome;
    private int capacitadeMaxima = 100;
    private int passageirosAtuais;


    public Trem(String nome, int capacitadeMaxima) {
        this.nome = nome;
        this.capacitadeMaxima = capacitadeMaxima;
        this.passageirosAtuais = 0;

    }

    public void embarcar(int quantidade){
        if(passageirosAtuais + quantidade <= capacitadeMaxima){
            passageirosAtuais += quantidade;
            System.out.println("Embarcado!!!");


        } else {
            System.out.println("Capacidade execida!");
        }
    }

    public void desembarcar(int quantidade){
        if (quantidade <= passageirosAtuais){
            passageirosAtuais -= quantidade;
        }  else {
            passageirosAtuais = 0;
            System.out.println("Todos os passageiros desembarcaram.");
        }

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacitadeMaxima() {
        return capacitadeMaxima;
    }

    public void setCapacitadeMaxima(int capacitadeMaxima) {
        this.capacitadeMaxima = capacitadeMaxima;
    }

    public int getPassageirosAtuais() {
        return passageirosAtuais;
    }

    public void setPassageirosAtuais(int passageirosAtuais) {
        this.passageirosAtuais = passageirosAtuais;
    }
}
