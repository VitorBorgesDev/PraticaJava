package LogicaJava.ExerciciosCompletos.Completos.ContaBancaria.Dominio;


public class Login {
    private String nome;
    private String cpf;




    public Login(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }





    public void LoginUsuario(){
        System.out.println("Nome Do Usuario: " + this.nome);
        System.out.println("CPF do Usuario: " + this.cpf);

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
