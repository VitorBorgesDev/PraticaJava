package LogicaJava.ExerciciosCompletos.Completos.MiniCarrinho.Test;

import LogicaJava.ExerciciosCompletos.Completos.MiniCarrinho.Domain.CarrinhoProduto;
import LogicaJava.ExerciciosCompletos.Completos.MiniCarrinho.Domain.Produto;

public class ProdutoTest {
    static void main(String[] args) {
        CarrinhoProduto carrinhoProduto = new CarrinhoProduto();

        Produto p1 = new Produto("Mouse", 89.99, 2);
        Produto p2 = new Produto("Mouse", 100, 5);
        carrinhoProduto.AdicionarProduto(p1);
        carrinhoProduto.AdicionarProduto(p2);

        carrinhoProduto.listarProdutos();

        carrinhoProduto.calcularTotal();

        carrinhoProduto.buscarProduto("Mouse");





    }


}
