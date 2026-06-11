package LogicaJava.ExerciciosCompletos.Completos.JogoRPG.Dominio;

public class Mago extends Personagem {
    private int Magia = 50;


    public Mago(String nome) {
        super(nome);
    }

    @Override
    public void atacar(){
        System.out.println(getNome() + " Lança bolo de fogo!! ");
        lancarMagia();
        GanharExperiencia(20);
        System.out.println("Sua experiencia atual é: "  + getExperiencia());



    }

    public void lancarMagia(){
        Magia = 50;
    }


}
