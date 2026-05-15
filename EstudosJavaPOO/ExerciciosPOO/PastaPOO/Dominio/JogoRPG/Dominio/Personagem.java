package LogicaJava.PastaPOO.Dominio.JogoRPG.Dominio;

public class Personagem {
    private String nome;
    private int Vida;
    private int Nivel;
    private int Experiencia;



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

    public void atacar(){}

    public int ReceberDano(int Dano) {
        Vida -= Dano;
        if (Vida <= 0) {
            System.out.println(getNome() + " Morreu!");
        } else {
            System.out.println(getNome() + "Recebeu Dano, sua vida atual é: " + Vida);

        }

        return Vida;


    }

    public int CurarVida(int Curar) {
        if (Vida > 100) {
            System.out.println(getNome() + "Parece que sua vida ja esta completa" + Vida);
        } else {
            Vida += Curar;
            if (Vida > 100) {
                Vida = 100;
            }
            System.out.println(getNome() + "Curou sua vida, atual é: " + Vida);
        }

        Vida += Curar;
        if (Vida <= 0) {
            System.out.println(getNome() + " Morreu!");
        } else {
            System.out.println(getNome() + "Recebeu Dano, sua vida atual é: " + Vida);

        }
        return Curar;


    }


    public int GanharExperiencia(int XP) {
        Experiencia += XP;
        VerificarSubiuDeNivel();
        return Experiencia;

    }

    private void VerificarSubiuDeNivel() {
        if (Experiencia > 100) {
            Nivel += 1;
            System.out.println(getNome() + "Parabens você subiu de nivel: " + Nivel);
            Experiencia = 0;

        }
    }

    public void VerificarStatus() {
        System.out.println("Nome: " + getNome());
        System.out.println("vida: " + getVida());
        System.out.println("Nivel: " + getNivel());
        System.out.println("Experiencia: " + getExperiencia());


    }


}