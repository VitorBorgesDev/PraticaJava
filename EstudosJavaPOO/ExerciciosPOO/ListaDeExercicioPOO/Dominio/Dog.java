package LogicaJava.ListaDeExercicioPOO.Dominio;

public class Dog {
    // task name, color the dog

    private String nome;
    private String color;


    public Dog(String nome, String color) {
        this.nome = nome;
        this.color = color;

    }

    public void Imprime() {
        System.out.println("Nome: " + nome);
        System.out.println("Color: " + color);
    }

}