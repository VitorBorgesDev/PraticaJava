package LogicaJava.ExerciciosCompletos.Completos.LojaComPagamento.dominio;

import java.util.ArrayList;

public class Mercado {
    private ArrayList<Produto> estoque;


    public Mercado() {
        this.estoque = new ArrayList<>();
    }


    public void adicionarProdutoNoEstoque(Produto produto) {
        estoque.add(produto);
        System.out.println("---------------------------");
        System.out.println("Produto adicionado com sucesso!");

    }


   public void listarProdutosDisponiveis() {
       for (Produto produto : estoque) {
           System.out.println("Nome: " + produto.getNomeProduto());
           System.out.println("Codigo: " + produto.getCodigoProduto());
           System.out.printf("Preço: R$ %.2f%n", produto.getPrecoProduto());
           System.out.println("------------------------------");


       }
   }



    public Produto buscarProdutoPorCodigo(int codigo) {
        for (Produto produto : estoque) {
            if (produto.getCodigoProduto() == codigo) {
                return produto;

            }


        }
        return null;
    }

}




