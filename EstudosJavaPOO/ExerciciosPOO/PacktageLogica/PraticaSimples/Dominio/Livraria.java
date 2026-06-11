package LogicaJava.PacktageLogica.PraticaSimples.Dominio;

public class Livraria {
    private String titulo;
    private int numeroPaginas;
    private boolean emprestado;
    private String autor;


    public Livraria() {
    }

    public Livraria(String titulo, int numeroPaginas, boolean emprestado, String autor) {
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;
        this.emprestado = emprestado;
        this.autor = autor;


    }

   public void mostrarInformacoes(){
       System.out.println("Titulo: " + titulo);
       System.out.println("Autor: " + autor);
       System.out.println("Paginas: " + numeroPaginas);
       System.out.println("Emprestado: " + emprestado);


   }


    public void emprestarLivro(){
        if(!emprestado){
            System.out.println("Emprestado com sucesso");
            emprestado = true;
        } else {
            System.out.println(" Livro não disponivel para empréstimo!!");
        }



    }

    public void devolverLivro(){
        if(emprestado){
            System.out.println("Livro devolvido com sucesso!");
            emprestado = false;

        } else {
            System.out.println("Esse livro já está disponível.");
        }


    }




}
