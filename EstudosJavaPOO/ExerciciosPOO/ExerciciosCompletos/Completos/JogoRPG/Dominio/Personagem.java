package LogicaJava.ExerciciosCompletos.Completos.JogoRPG.Dominio;

public class Personagem {
    private String nome;
    private int Vida;
    private int Nivel;
    private int Experiencia;
    public String personagemEscolhido;


    public void setPersonagemEscolhido(String personagemEscolhido){
        this.personagemEscolhido = personagemEscolhido;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVida(int vida) {
        Vida = vida;
    }

    public void setNivel(int nivel) {
        Nivel = nivel;
    }

    public void setExperiencia(int experiencia) {
        Experiencia = experiencia;
    }

    public Personagem(String nome) {
        this.nome = nome;
    }

    public Personagem() {
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return Vida;
    }

    public int getNivel() {
        return Nivel;
    }

    public int getExperiencia() {
        return Experiencia;
    }

    public void atacar() {


    }

    public int ReceberDano(int Dano) {
        Vida -= Dano;
        if (Vida <= 0) {
            System.out.println(getNome() + " Morreu!");
        } else {
            System.out.println(getNome() + " Recebeu Dano, sua vida atual é: " + Vida);

        }
        return Vida;

    }

    public int CurarVida(int Curar) {
        if (Vida >= 100) {
            System.out.println(getNome() + " Sua vida ja está cheia! ");
            return Vida;
        }

        Vida += Curar;

        if (Vida > 100) {
            Vida = 100;

        }

        System.out.println(getNome() + " curou " + Curar + " de vida.");
        System.out.println("Vida atual: " + Vida);


        return Vida;
    }

    public int GanharExperiencia(int XP) {
        Experiencia += XP;
        VerificarSubiuDeNivel();
        return Experiencia;

    }

    private void VerificarSubiuDeNivel() {
        if (Experiencia > 100) {
            Nivel += 1;
            System.out.println(getNome() + " Parabens você subiu de nivel: " + Nivel);
            Experiencia = 0;

        }
    }

    public void VerificarStatus() {
        System.out.println("---------------STATUS--------------");
        System.out.println("Nome: " + getNome());
        System.out.println("vida: " + getVida());
        System.out.println("Nivel: " + getNivel());
        System.out.println("Experiencia: " + getExperiencia());


    }


}