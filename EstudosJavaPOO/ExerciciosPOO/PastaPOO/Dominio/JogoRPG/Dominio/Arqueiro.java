package LogicaJava.PastaPOO.Dominio.JogoRPG.Dominio;

public class Arqueiro extends Personagem {
    private int Precisao = 15;


    public Arqueiro(String nome) {
        super(nome);
    }

    @Override
    public void atacar() {

        System.out.println("Atira flecha ");
        AtirarFlecha();
        GanharExperiencia(20);
        System.out.println("Sua experiencia atual é: " + getExperiencia());
    }

    public void AtirarFlecha(){
        Precisao = 15;
    }

}
