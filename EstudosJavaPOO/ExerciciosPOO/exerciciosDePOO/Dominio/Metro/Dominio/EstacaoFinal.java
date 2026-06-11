package LogicaJava.exerciciosDePOO.Dominio.Metro.Dominio;

public class EstacaoFinal extends Estacao {
    public EstacaoFinal(String nome, int pessoasEsperando, int quantidadeMaxima) {
        super(nome, pessoasEsperando, quantidadeMaxima * 2 );

    }

    @Override
    public String descricao() {
        return "Estação Final";


    }






}
