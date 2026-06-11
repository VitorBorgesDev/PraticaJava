package LogicaJava.ExerciciosCompletos.Completos.Livraria.Dominio;

import LogicaJava.ExerciciosCompletos.Completos.Livraria.Dominio.StatusLivro.StatusLivro;

import java.time.LocalDate;


import java.time.temporal.ChronoUnit;

public class Livros {
    private static final  int PRAZO_MAXIMO = 30;

    private final String titulo;
    private final String autor;
    private final int numeroPaginas;
    private StatusLivro status;
    private LocalDate dataEmprestimo;
    private int prazoDevolucao;





    public Livros(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.status = StatusLivro.DISPONIVEL;
    }

    public void emprestar() {

        if (status == StatusLivro.DISPONIVEL) {
            status = StatusLivro.EMPRESTADO;

            //dataEmprestimo = LocalDate.now().minusDays(40);

            dataEmprestimo = LocalDate.now();
            System.out.println("\"" + titulo + "\" emprestado com sucesso!");

        } else {

            System.out.println("Livro já está emprestado.");
        }
    }


    public double devolver() {
        if (status == StatusLivro.EMPRESTADO) {

            long diasEmprestado = ChronoUnit.DAYS.between(
                    dataEmprestimo,
                    LocalDate.now()
            );

            long atraso = diasEmprestado - PRAZO_MAXIMO;

            status = StatusLivro.DISPONIVEL;

            if (atraso > 0) {
                double multa = atraso * 2.50;


                System.out.println("---------------------------");
                System.out.println("Livro devolvido com atraso!");
                System.out.println("Dias de atraso: " + atraso);
                System.out.println("Multa: R$ " + multa);
                System.out.println("---------------------------");
                return multa;


            } else {
                System.out.println("Livro devolvido dentro do prazo.");
                return 0;
            }


        }


        return 0;
    }


    public void definirPrazoDevolucao(int dias) {
        this.prazoDevolucao = dias;
    }

    public int getPrazoDevolucao() {
        return prazoDevolucao;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }


    public boolean isEmprestado() {
        return this.status == StatusLivro.EMPRESTADO;

    }

    public boolean isDisponivel() {
        return this.status == StatusLivro.DISPONIVEL;
    }


    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public StatusLivro getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return String.format("[%s] \"%s\" - %s (%d págs.)", status, titulo, autor, numeroPaginas);
    }


}


