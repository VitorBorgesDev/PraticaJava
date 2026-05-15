package LogicaJava.PastaPOO.Dominio.Loja.Dominio;

public class ItemPedido {
    private Produto01 produto;
    private int quantidade;
    private Double precoUnitario;


    public ItemPedido(Produto01 produto, Double preçoUnitario, int quantidade) {
        this.produto = produto;
        this.precoUnitario = preçoUnitario;
        this.quantidade = quantidade;
    }

    public Produto01 getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Double getPreçoUnitario() {
        return precoUnitario;
    }


    public double calcularSubtotal(){
        return quantidade * precoUnitario;

    }

}












