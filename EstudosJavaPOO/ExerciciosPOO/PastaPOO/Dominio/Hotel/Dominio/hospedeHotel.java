package LogicaJava.PastaPOO.Dominio.Hotel.Dominio;

public class hospedeHotel {
    private String nome;
    private String cpf;

    public hospedeHotel(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void mostrarInfoHotel() {
        System.out.println("Nome do Hospede: " + this.nome);
        System.out.println("CPF do Hospede: " + this.cpf);
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}

