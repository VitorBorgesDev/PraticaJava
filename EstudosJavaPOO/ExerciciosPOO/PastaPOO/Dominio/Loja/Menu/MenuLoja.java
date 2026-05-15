package LogicaJava.PastaPOO.Dominio.Loja.Menu;

import LogicaJava.PastaPOO.Dominio.Loja.Dominio.Pedido;
import LogicaJava.PastaPOO.Dominio.Loja.Dominio.Produto01;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuLoja {

    Scanner entrada = new Scanner(System.in);
    Pedido pedido = new Pedido();
    ArrayList<Produto01> produtos = new ArrayList<>();



    public MenuLoja() {
        produtos.add(new Produto01("Notebook", 3000, 10));
        produtos.add(new Produto01("Celular", 2000, 5));
        produtos.add(new Produto01("Mouse", 100, 20));
        produtos.add(new Produto01("Cadeira", 500, 8));
    }



    public void iniciarMenu() {
        int opcao = 0;

        while (opcao != 4) {

            System.out.println("\n=== MENU DA LOJA ===");
            System.out.println("1 - Mostrar produtos");
            System.out.println("2 - Comprar produto");
            System.out.println("3 - Mostrar total do pedido");
            System.out.println("4 - Sair");
            System.out.print("Escolha: ");

            opcao = entrada.nextInt();

            if (opcao == 1) {
                mostrarProdutos();
            }

            else if (opcao == 2) {
                comprarProduto();
            }

            else if (opcao == 3) {
                System.out.println("Total do pedido: " + pedido.CalcularSubtotal());
            }

            else if (opcao == 4) {
                System.out.println("Saindo...");
            }

            else {
                System.out.println("Opção inválida.");
            }
        }
    }



    public void mostrarProdutos() {
        System.out.println("\n=== PRODUTOS DISPONÍVEIS ===");

        for (int i = 0; i < produtos.size(); i++) {
            Produto01 p = produtos.get(i);

            System.out.println(
                    i + " - " +
                            p.getNome() +
                            " | Preço: " + p.getPreco() +
                            " | Estoque: " + p.getEstoque()
            );
        }
    }


    public void comprarProduto() {
        mostrarProdutos();

        System.out.print("Digite o número do produto: ");
        int indice = entrada.nextInt();

        System.out.print("Digite a quantidade: ");
        int quantidade = entrada.nextInt();

        Produto01 produtoEscolhido = produtos.get(indice);

        pedido.adicionarProduto(produtoEscolhido, quantidade);

        System.out.println("Produto adicionado ao pedido!");
    }
}