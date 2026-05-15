package LogicaJava.PastaPOO.Dominio.Loja.Dominio;

public class Produto01 {
    private String nome;
    private double preco;
    private int estoque;


    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public Produto01(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public void adicionarEstoque(int quantidade, String Pedido){
        if(quantidade > 0){
            this.estoque += quantidade;
            System.out.println("Produto adicionado ao estoque! " + estoque  );
        } else {
            System.out.println("quantidade invalida! ");
        }

    }

    public void diminuirEstoque(int diminuirQuantidade){
        if(diminuirQuantidade <= estoque && diminuirQuantidade >= 1) {
            this.estoque -= diminuirQuantidade;
            System.out.println("Estoque atualizado! " + estoque );
        }else {
            System.out.println("Estoque insuficiente! ");
        }

    }


}
