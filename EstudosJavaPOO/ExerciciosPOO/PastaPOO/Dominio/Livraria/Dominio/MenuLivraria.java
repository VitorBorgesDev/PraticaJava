package LogicaJava.PastaPOO.Dominio.Livraria.Dominio;

import java.util.Scanner;

public class MenuLivraria {
    Scanner entrada = new Scanner(System.in);

    Livraria livro1 = new Livraria("Dom Casmurro", 256, false, "Machado de Assis");
    Livraria livro2 = new Livraria("Harry Potter", 264, false, "J.K. Rowling");
    Livraria livro3 = new Livraria("Clean Code", 464, false, "Robert C. Martin");

    public void iniciarLivraria() {
        boolean escolha = true;

        do {
            System.out.println("=== BIBLIOTECA ===");
            System.out.println("1 - Dom Casmurro");
            System.out.println("2 - Harry Potter");
            System.out.println("3 - Clean Code");
            System.out.println("4 - Sair");
            System.out.println("Escolha seu livro:");

            int opcaoLivro = entrada.nextInt();

            Livraria livroEscolhido = null;

            if (opcaoLivro == 1) {
                livroEscolhido = livro1;

            } else if (opcaoLivro == 2) {
                livroEscolhido = livro2;

            } else if (opcaoLivro == 3) {
                livroEscolhido = livro3;

            } else if (opcaoLivro == 4) {
                System.out.println("Saindo...");
                escolha = false;

            } else {
                System.out.println("Opção inválida");
            }


            if (livroEscolhido != null) {

                System.out.println("1 - Mostrar informações");
                System.out.println("2 - Emprestar livro");
                System.out.println("3 - Devolver livro");
                System.out.println("Escolha uma ação:");

                int acao = entrada.nextInt();

                switch (acao) {
                    case 1:
                        livroEscolhido.mostrarInformacoes();
                        break;

                    case 2:
                        livroEscolhido.emprestarLivro();
                        break;

                    case 3:
                        livroEscolhido.devolverLivro();
                        break;

                    default:
                        System.out.println("Opção inválida");
                }

                System.out.println("Deseja continuar?");
                System.out.println("1 - Sim");
                System.out.println("2 - Não");

                int continuar = entrada.nextInt();

                if (continuar == 2) {
                    escolha = false;
                }
            }

        } while (escolha);

        System.out.println("Boa leitura!");
    }
}