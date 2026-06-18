package LogicaJava.ExerciciosSimples.Incompletos.locadoraDeCarro.Dominio.Login;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private int numero;
    private String senha;
    private ArrayList<Cliente> clientes;
    private LoginCliente loginCliente;


    public Cliente(String nome, int numero, String senha) {
        this.nome = nome;
        this.numero = numero;
        this.senha = senha;

    }

    public Cliente(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }





    public void mostrarInformacoes() {
        System.out.println("Nome do cliente: " + this.nome );
        System.out.println("Senha do cliente: " + this.senha );
        System.out.println("Numero do cliente: " + this.numero );


    }



    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }


    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
