package LogicaJava.exerciciosDePOO.Dominio.LojaComPagamento.dominio;

import java.util.ArrayList;

public class Carrinho {
    private ArrayList<Produto> produtosNoCarrinho;


    public Carrinho() {
        this.produtosNoCarrinho = new ArrayList<>();
    }


    public void adicionarProduto(Produto produto) {
        produtosNoCarrinho.add(produto);
        System.out.println("Produto adicionado com sucesso!");

    }

    public void removerProduto(Produto produto) {
        for (Produto item : produtosNoCarrinho) {
            if (item.getCodigoProduto() == produto.getCodigoProduto()) {
                produtosNoCarrinho.remove(item);
                System.out.println("Produto removido com sucesso!");
                return;
            }
        }
        System.out.println("Produto não encontrado!");
    }


    public void listarProdutos() {
        for (Produto produto : produtosNoCarrinho) {
            System.out.println("-----------------------");
            System.out.println("Produto: " + produto.getNomeProduto());
            System.out.println("Codigo: " + produto.getCodigoProduto());
            System.out.printf("Preço: R$ %.2f%n", produto.getPrecoProduto());
            System.out.print("--------------------------");

        }


    }

    public double calcularTotalCarrinho() {
        double valorProduto = 0;
        for (Produto produto : produtosNoCarrinho) {
            valorProduto += produto.getPrecoProduto();


        }
        return valorProduto;
    }


    public void esvaziarCarrinho() {
        produtosNoCarrinho.clear();
        System.out.println("Carrinho esvaziado com sucesso!");

    }


}
