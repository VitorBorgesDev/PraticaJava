package LogicaJava.exerciciosDePOO.Dominio.locadoraDeCarro.Dominio;

public class Cliente {
    private String nome;
    private int numero;
    private String senha;


    public Cliente(String nome, int numero, String senha) {
        this.nome = nome;
        this.numero = numero;
        this.senha = senha;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome do cliente: " + this.nome );
        System.out.println("Senha do cliente: " + this.senha );
        System.out.println("Numero do cliente: " + this.numero );


    }

    public void mostrarInformacoesCarro() {
        mostrarInformacoes();
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
