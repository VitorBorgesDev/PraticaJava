package LogicaJava.exerciciosDePOO.Dominio.LojaComPagamento.dominio;

import LogicaJava.exerciciosDePOO.Dominio.locadoraDeCarro.Dominio.Cliente;

import java.util.Scanner;

public class MenuPrincipal {
    private Scanner entrada = new Scanner(System.in);
    private Mercado mercado;
    private Carrinho carrinho;


    public MenuPrincipal() {
        this.carrinho = new Carrinho();
        this.mercado = new Mercado();

        mercado.adicionarProdutoNoEstoque(new Produto("Azeite", 50.0, 10, 101560, "Óleo"));
        mercado.adicionarProdutoNoEstoque(new Produto("Arroz", 25.5, 20, 101672, "Grãos"));
        mercado.adicionarProdutoNoEstoque(new Produto("Feijão", 30.5, 40, 11170, "Óleo"));
        mercado.adicionarProdutoNoEstoque(new Produto("Coca-cola", 11.0, 200, 676767, "Refrigerantes"));


    }


    public void iniciarMenuPrincipal() {
        int opcao = 0;
        boolean continuar = true;


        while (continuar) {
            System.out.println("\nMENU PRINCIPAL\n");
            System.out.println("1 - Ver produtos disponíveis");
            System.out.println("2 - Adicionar produto no carrinho");
            System.out.println("3 - Remover produto do carrinho");
            System.out.println("4 - Ver carrinho");
            System.out.println("5 - Ver total do carrinho");
            System.out.println("6 - Esvaziar carrinho");
            System.out.println("0 - Sair");


            opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    mercado.listarProdutosDisponiveis();
                    break;


                case 2:

                    System.out.println("Insira o codigo do produto: ");
                    int codigo = entrada.nextInt();

                    Produto produtoEncontrado = mercado.buscarProdutoPorCodigo(codigo);


                    if (produtoEncontrado == null) {
                        System.out.println("Insira um codigo valido");


                    } else {
                        carrinho.adicionarProduto(produtoEncontrado);
                    }
                    break;


                case 3:
                    System.out.println("Insira codigo do produto a ser exluído: ");
                    int codigo2 = entrada.nextInt();

                    Produto produtoEncontrado1 = mercado.buscarProdutoPorCodigo(codigo2);


                    if (produtoEncontrado1 == null) {
                        System.out.println("Insira um código valido:");
                    } else {
                        carrinho.removerProduto(produtoEncontrado1);


                    }

                    break;


                case 4:
                    System.out.println("-----------Seus Produtos---------");
                    carrinho.listarProdutos();
                    break;


                case 5:
                    System.out.printf("Valor total: R$ %.2f%n ", carrinho.calcularTotalCarrinho());
                    break;


                case 6:
                    carrinho.esvaziarCarrinho();
                    break;

                case 0:
                    continuar = false;
                    System.out.println("Saindo!...");
                    break;

            }


        }


    }


}









