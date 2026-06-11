package LogicaJava.ExerciciosCompletos.Completos.Livraria.Dominio;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Livros> livros =  new ArrayList<>();
    private Livros livro;

    public void emprestarLivro( Livros livro){
        livros.add(livro);

    }





}
