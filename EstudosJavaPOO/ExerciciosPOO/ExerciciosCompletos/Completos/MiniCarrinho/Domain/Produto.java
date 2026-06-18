package LogicaJava.ExerciciosCompletos.Completos.MiniCarrinho.Domain;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;


    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }


    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public void MostrarInformacoes() {
        System.out.println("Nome do Produto: " + nome);
        System.out.println("Preço do produto: " + preco);
        System.out.println("Quantidade do produto: " + quantidade);
    }











































}
