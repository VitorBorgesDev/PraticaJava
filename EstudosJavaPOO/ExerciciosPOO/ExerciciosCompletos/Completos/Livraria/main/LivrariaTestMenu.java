package LogicaJava.ExerciciosCompletos.Completos.Livraria.main;

import LogicaJava.ExerciciosCompletos.Completos.Livraria.Dominio.Livraria;
import LogicaJava.ExerciciosCompletos.Completos.Livraria.Dominio.Menu.MenuLivraria;

public class LivrariaTestMenu {
    static void main(String[] args) throws InterruptedException {
        Livraria livraria = new Livraria();
        MenuLivraria menu = new MenuLivraria(livraria);

        menu.comecarMenuLivros();





    }

}
