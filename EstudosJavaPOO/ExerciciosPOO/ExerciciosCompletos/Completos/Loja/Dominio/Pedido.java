package LogicaJava.ExerciciosCompletos.Completos.Loja.Dominio;
import java.util.ArrayList;

public class Pedido {

    private ArrayList<ItemPedido> itens;

    public Pedido() {
        this.itens = new ArrayList<>();
    }


    public void adicionarProduto(Produto01 produto, int quantidade){
        ItemPedido item = new ItemPedido(produto, produto.getPreco(), quantidade);
        itens.add(item);
        produto.diminuirEstoque(quantidade);
    }

    public double CalcularSubtotal(){
        double total = 0;

        for(ItemPedido item: itens){
            total += item.calcularSubtotal();

        }
        return total;
    }

}
