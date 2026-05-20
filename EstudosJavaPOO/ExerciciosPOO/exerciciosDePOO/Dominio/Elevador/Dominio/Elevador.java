package LogicaJava.exerciciosDePOO.Dominio.Elevador.Dominio;

import java.util.ArrayList;

public class Elevador {
    private ArrayList<Pessoa> pessoasDentro;
    private int andarAtual;
    private int capacidadeMaximaPessoas;
    private double pesoMaximo;
    private int totalAndares;

    public Elevador( int capacidadeMaximaPessoas, double pesoMaximo,  int totalAndares) {
        this.pessoasDentro = new ArrayList<>();
        this.capacidadeMaximaPessoas = capacidadeMaximaPessoas;
        this.totalAndares = totalAndares;
        this.pesoMaximo = pesoMaximo;
        this.andarAtual = 0;

    }



    public double calcularPesoAtual() {
        for(Pessoa pessoa : pessoasDentro){
            pesoMaximo = pesoMaximo + pessoa.getPeso();
            return  pesoMaximo;


        }
        return 0;
    }



}
