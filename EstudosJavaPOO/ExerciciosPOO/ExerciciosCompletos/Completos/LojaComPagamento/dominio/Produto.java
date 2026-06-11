package LogicaJava.ExerciciosCompletos.Completos.LojaComPagamento.dominio;

public class Produto {
    private String nomeProduto;
    private double precoProduto;
    private int quantidadeProduto;
    private int codigoProduto;
    private String categoriaProduto;


    public Produto(String nomeProduto, double precoProduto, int quantidadeProduto, int codigoProduto, String categoriaProduto) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.codigoProduto = codigoProduto;
        this.categoriaProduto = categoriaProduto;

    }

    public void mostrarInformacoes() {
        System.out.println("-------------------------------");
        System.out.println("Nome do produto: " + this.nomeProduto);
        System.out.println("Preco do produto: " + this.precoProduto);
        System.out.println("Quantidade do produto: " + this.quantidadeProduto);
        System.out.println("Codigo do produto: " + this.codigoProduto);
        System.out.println("Categoria do produto: " + this.categoriaProduto);
        System.out.println("------------------------------");

    }

    public void adicionarEstoque(int adicionar) {
        if (adicionar > 0) {
            this.quantidadeProduto += adicionar;
            System.out.println("Produto adicionado ao estoque! " + quantidadeProduto);

        } else {
            System.out.println("Não foi possivel adicionar estoque!");
        }


     }


    public String getNomeProduto() {
        return nomeProduto;
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }


    public void retirarDoEstoque(int diminuirQuantidade) {
        if (diminuirQuantidade <= quantidadeProduto && diminuirQuantidade > 0) {
            this.quantidadeProduto -= diminuirQuantidade;
            System.out.println("Estoque atualizado! " + quantidadeProduto);


        } else {
            System.out.println("Valor invalido! ");
        }


    }


}
