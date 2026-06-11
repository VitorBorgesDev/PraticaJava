package LogicaJava.exerciciosDePOO.Dominio.JogoRPG.Dominio;

public class Guerreiro extends Personagem {
    private int Força = 10;

    public Guerreiro(String nome) {
        super(nome);
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " ataca com espada");
        AtacarComEspada();
        GanharExperiencia(20);
        System.out.println("Sua experiencia atual é:  " + getExperiencia());

    }

    public void AtacarComEspada() {
        Força = 10;
    }

}
