package LogicaJava.exerciciosDePOO.Dominio.Livraria.main;

import LogicaJava.exerciciosDePOO.Dominio.Livraria.Dominio.Livraria;
import LogicaJava.exerciciosDePOO.Dominio.Livraria.Dominio.Livros;
import LogicaJava.exerciciosDePOO.Dominio.Livraria.Dominio.Menu.MenuLivraria;

public class LivrariaTestMenu {
    static void main(String[] args) throws InterruptedException {
        Livraria livraria = new Livraria();




        MenuLivraria menu = new MenuLivraria(livraria);



        menu.comecarMenuLivros();





    }

}
