package LogicaJava.exerciciosDePOO.Dominio.Livraria.Dominio.Menu;

import LogicaJava.exerciciosDePOO.Dominio.Livraria.Dominio.Livraria;
import LogicaJava.exerciciosDePOO.Dominio.Livraria.Dominio.Livros;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuLivraria {


    Scanner entrada = new Scanner(System.in);
    private Livraria livraria;
    private Livros livros;


    public MenuLivraria(Livraria livraria) {
        this.livraria = livraria;
        livrosPadrao();

    }


    private void livrosPadrao() {
        if (!livraria.getLivros().isEmpty()) {
            return;

        }

        Livros[] livrosInicial = {
                new Livros("Dom Casmurro", "Machado de Assis", 256),
                new Livros("O Cortiço", "Aluísio Azevedo", 304),
                new Livros("Capitães da Areia", "Jorge Amado", 288),
                new Livros("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 264),
                new Livros("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 96),
        };

        for (Livros livro : livrosInicial) {
            livraria.adicionarLivro(livro);


        }


    }


    public void comecarMenuLivros() throws InterruptedException {
        boolean continuar = true;

        do {
            System.out.println("*******BEM-VINDO*******");
            System.out.println("1. Adicionar livro");
            System.out.println("2. Remover livro");
            System.out.println("3. Mostrar livros adicionados "); // quero que isso tambem deixe excluir
            System.out.println("4. Listar livros disponiveis"); // deixar pegar emprestado) (pretendo pegar algum emprestado?) se sim pegue (pedir dias de emprestimo diasMax 30)/ se nao o programa volta
            System.out.println("5. Mostrar os emprestados"); //pretende devolver algum?
            System.out.println("6. Devolver"); //se tiver execido o limite paga) se nao (voce esta em dia!)
            System.out.println("7. Mostrar resumo");
            System.out.println("0. sair");
            System.out.println("************************");


            int opcao = entrada.nextInt();
            switch (opcao) {


                case 1:
                    System.out.println("////////////////////////////");
                    System.out.println("Adicione seu livro!");
                    System.out.println("Qual o titulo do livro?");
                    entrada.nextLine();                              // limpar buffer se veio de um nextInt anterior
                    String tituloLivro = entrada.nextLine();

                    System.out.println("Qual o autor do livro?");
                    String autorLivro = entrada.nextLine();

                    System.out.println("Quantas paginas tem esse livro?");
                    int paginasLivro = entrada.nextInt();

                    Livros livros = new Livros(tituloLivro, autorLivro, paginasLivro);
                    livraria.adicionarLivro(livros);
                    System.out.println("Livro adicionado com sucesso! ! ");
                    System.out.println("--------------------------------");

                    break;


                case 2:
                    livraria.mostrarDisponiveis();

                    System.out.println("Qual o índice do livro que pretende remover? ");
                    int indice = entrada.nextInt();
                    livraria.removerLivro(indice);

                    break;



                case 3:
                    livraria.ListarLivrosAdicionados();
                    break;


                case 4:

                    System.out.println("Todos os livros disponíveis:");
                    livraria.mostrarDisponiveis();

                    System.out.println("Pretende pegar algum emprestado? (S/N)");
                    entrada.nextLine();
                    String opcao2 = entrada.nextLine();

                    if (opcao2.equalsIgnoreCase("S")) {

                        System.out.println("Qual o índice escolhido?");
                        int indice1 = entrada.nextInt();

                        Livros livro = livraria.listarLivro(indice1);

                        if (livro == null) {
                            System.out.println("Livro não encontrado.");
                            break;
                        }

                        System.out.println("Por quantos dias deseja pegar o livro?");
                        int dias = entrada.nextInt();

                        livro.definirPrazoDevolucao(dias);

                        livraria.emprestarLivro(livro);

                        System.out.println("Prazo informado: " + dias + " dias");
                        System.out.println("Prazo maximo: 30 dias ");
                        System.out.println("--------------------------------");
                    }
                    break;


                case 5:
                    livraria.mostrarEmprestados();
                    break;


                case 6:
                    System.out.println("***SEUS LIVROS***");
                    livraria.mostrarEmprestados();

                    System.out.println("Qual livro você pretende devolver?");
                    int indice2 = entrada.nextInt();

                    Livros livro = livraria.listarLivro(indice2);

                    if (livro != null) {

                        double multa = livro.devolver();

                        livraria.adicionarMulta(multa);

                        if (multa > 0) {
                            System.out.println("Multa pendente: R$ " + multa);
                        }

                    }
                    break;


                case 7:
                    livraria.mostrarResumo();
                    break;

                    



                case 0:
                    System.out.println("Saindo..");
                    Thread.sleep(1500);
                    continuar = false;

            }

        } while (continuar);


    }


}
















