package LogicaJava.exerciciosDePOO.Dominio.Metro.Dominio;

public abstract class Estacao {
    private String nome;
    private int pessoasEsperando;
    private int quantidadeMaxima;



    public Estacao(String nome, int pessoasEsperando, int quantidadeMaxima) {
        this.nome = nome;
        this.pessoasEsperando = pessoasEsperando;
        this.quantidadeMaxima = quantidadeMaxima;


    }

    public abstract String descricao();



    public String getNome() {
        return nome;
    }


    public int getPesssoasEsperando() {
        return pessoasEsperando;
    }


    public int getQuantidadeMaxima() {
        return quantidadeMaxima;
    }

}



