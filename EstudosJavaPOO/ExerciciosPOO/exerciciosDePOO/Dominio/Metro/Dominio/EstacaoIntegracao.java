package LogicaJava.exerciciosDePOO.Dominio.Metro.Dominio;

import java.util.ArrayList;

public class EstacaoIntegracao extends Estacao {
    private ArrayList<String> conexoes;


    public EstacaoIntegracao(String nome, int pessoasEsperando, int quantidadeMaxima) {
        super(nome, pessoasEsperando, quantidadeMaxima);
        this.conexoes = new ArrayList<>();


    }

    public void adicionarConexao(String linhas){
        conexoes.add(linhas);
    }

    public void listarConexoes(){
        for(String conexao : conexoes){
            System.out.println(conexao);
        }
    }


    @Override
    public String descricao() {
        return "Estacão Integracão";
    }



}

