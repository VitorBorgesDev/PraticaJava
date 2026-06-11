package LogicaJava.exerciciosDePOO.Dominio.Metro.Dominio;

public class EstacaoComum  extends Estacao {
    public EstacaoComum(String nome,  int pessoasEsperando, int quantidadeMaxima) {
        super(nome, pessoasEsperando, quantidadeMaxima);
    }

  @Override
    public String descricao() {
      return "Estação comum";
  }




}
