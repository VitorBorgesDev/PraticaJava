package LogicaJava.ExerciciosCompletos.Completos.ContaBancaria.Dominio;


import java.util.ArrayList;
import java.util.List;

public class Login extends Usuario {
    String cpf;
    String nome;




    public Login(String nome, String cpf) {
        super(cpf, nome);
        this.cpf = cpf;
        this.nome = nome;

    }



    public void LoginUsuario(Usuario usuario) {
        System.out.println("Nome Do Usuario: " + usuario.getNome());
        System.out.println("CPF do Usuario: " + usuario.getCpf());

    }


























    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
