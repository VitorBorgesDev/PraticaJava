package LogicaJava.ExerciciosCompletos.Completos.MiniCarrinho.Domain;

import java.util.ArrayList;


public class CarrinhoProduto {
    ArrayList<Produto> produtos;

    public CarrinhoProduto() {
       produtos = new ArrayList<>();
    }

    public void AdicionarProduto(Produto produto) {
        produtos.add(produto);
    }


    public void listarProdutos() {
        for (Produto produto : produtos) {
            produto.MostrarInformacoes();
        }
    }


    public void calcularTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
            System.out.println("total : R$" + total);

        }
    }

    public void buscarProduto(String nome) {
        boolean existe = false;

        for (Produto produto : produtos) {
            produto.getNome().equalsIgnoreCase(nome);

            if (produto.getNome().equalsIgnoreCase(nome)) {
                existe = true;
                System.out.println("Produto encontrado!!");
            }
        }

        if (!existe) {
            System.out.println("Produto não encontrado!!");

        }

    }

}







