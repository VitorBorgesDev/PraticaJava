package LogicaJava.exerciciosDePOO.Dominio.Livraria.Dominio;

import LogicaJava.exerciciosDePOO.Dominio.Livraria.Dominio.StatusLivro.StatusLivro;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Livraria {
    private String nome;
    private List<Livros> livros = new ArrayList<>();
    private int totalEmprestimos = 0;

    private int totalLivrosAdicionados = 0;
    private int totalLivrosRemovidos = 0;
    private int totalLivrosEmprestimos = 0;
    private double totalMultas = 0;



    public Livraria(String nome) {
        this.nome = nome;

    }


    public Livraria() {

    }

    public void adicionarLivro(Livros livro) {
        if (livro == null) {
            System.out.println("Livro não pode ser nulo.");

        } else {
            livros.add(livro);
            totalLivrosAdicionados++;

        }
    }

    public void removerLivro(int indice) {
        if(indice < 0 || indice > livros.size()) {
            System.out.println("Escreva um valor valido!");
        }
        livros.remove(indice);
        System.out.println("Livro removido com sucesso!");
        System.out.println("Livro removido " + livros.get(indice).getTitulo());
        totalLivrosRemovidos++;


    }



    public void emprestarLivro(Livros livro) {
        if (!livros.contains(livro)) {
            System.out.println("Este livro não pertence a esta livraria.");
            return;
        }
        if (livro.isDisponivel()) {
            livro.emprestar();
            totalLivrosEmprestimos++;
            totalEmprestimos++;

        } else {
            System.out.println("\"" + livro.getTitulo() + "\" não está disponível.");
        }
    }




    public void mostrarDisponiveis() {
        System.out.println("Total de livros: " + livros.size());

        for (int i = 0; i < livros.size(); i++) {

            Livros livro = livros.get(i);

            if (livro.isDisponivel()) {

                System.out.println("-----------------------------");
                System.out.println(i + " - " + livro.getTitulo() + " | " + " Status " + " = " + livro.getStatus());


            }

        }

    }


    public void mostrarEmprestados() {
        boolean encontrou = false;

        for (int i = 0; i < livros.size(); i++) {
            Livros livro = livros.get(i);
            if (livro.isEmprestado()) {

                System.out.println("----------");
                System.out.println(i + " - " + livro.getTitulo() + " | " + " Status " + " = " + livro.getStatus());


                encontrou = true;

            }
            if (!encontrou) {
                System.out.println("----------");
            }
        }

    }

    public void adicionarMulta(double multa) {
        totalMultas += multa;
    }



    public void mostrarResumo() {
       long disponiveis = livros.stream()
               .filter(Livros::isDisponivel)
               .count();

       long emprestados = livros.stream()
               .filter(Livros::isEmprestado)
               .count();


        System.out.println("\n========== RESUMO GERAL==========");
        System.out.println("Livros adicionados : " + totalLivrosAdicionados);
        System.out.println("Livros removidos   : " + totalLivrosRemovidos);
        System.out.println("Empréstimos        : " + totalEmprestimos);
        System.out.println("Disponíveis        : " + disponiveis);
        System.out.println("Emprestados        : " + emprestados);
        System.out.println("Multas acumuladas  : R$ " + totalMultas);
        System.out.println("============================");



    }


    public void ListarLivrosAdicionados() {
        if (livros.isEmpty()) {
            System.out.println("nenhum livro adicionado.");
        } else {
            System.out.println("Livros adicionados: ");
            livros.forEach(System.out::println);
        }

    }




    public Livros listarLivro(int indice) {
        if (indice < 0 || indice >= livros.size()) {
            System.out.println("Digite um valor existente.");

        } else {
            Livros livro = livros.get(indice);
        }

        return livros.get(indice);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Livros> getLivros() {
        return livros;
    }

    public void setLivros(List<Livros> livros) {
        this.livros = livros;
    }

    public int getTotalEmprestimos() {
        return totalEmprestimos;
    }

    public void setTotalEmprestimos(int totalEmprestimos) {
        this.totalEmprestimos = totalEmprestimos;
    }
}









