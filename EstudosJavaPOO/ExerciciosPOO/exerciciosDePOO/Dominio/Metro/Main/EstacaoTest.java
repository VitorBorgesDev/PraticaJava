package LogicaJava.exerciciosDePOO.Dominio.Metro.Main;

import LogicaJava.exerciciosDePOO.Dominio.Metro.Dominio.EstacaoIntegracao;
import LogicaJava.exerciciosDePOO.Dominio.Metro.Dominio.Trem;


public class EstacaoTest {
    public static void main(String[] args) {
        EstacaoIntegracao integracao = new EstacaoIntegracao( "Central", 50, 100);

        integracao.adicionarConexao("Linha-Azul");
        integracao.adicionarConexao("Linha-Vermelha");

        Trem trem = new Trem("CEI CENTRO", 100);
        trem.embarcar(80);
        trem.desembarcar(30);

        integracao.listarConexoes();
        System.out.println(integracao.descricao());

    }



}
