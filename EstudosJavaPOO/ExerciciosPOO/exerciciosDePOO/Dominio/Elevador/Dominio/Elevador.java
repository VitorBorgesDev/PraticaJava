package LogicaJava.exerciciosDePOO.Dominio.Elevador.Dominio;

public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidadeMaxima;
    private int pessoasNoElevador;


    public Elevador(int andarAtual, int totalAndares, int capacidadeMaxima, int pessoaNoElevador) {
        this.andarAtual = andarAtual;
        this.totalAndares = totalAndares;
        this.capacidadeMaxima = capacidadeMaxima;
        this.pessoasNoElevador = pessoaNoElevador;
    }

    public Elevador() {
        this.andarAtual = 0;
        this.totalAndares = 22;
        this.capacidadeMaxima = 50;
        this.pessoasNoElevador = 0;

    }

    public void entrarPessoa(int pessoasEntrar) {
        if (pessoasNoElevador + pessoasEntrar <= this.capacidadeMaxima) {
            pessoasNoElevador += pessoasEntrar;

            System.out.println("Entrou: " + pessoasNoElevador + " pessoas");
            System.out.println("Capacidade maxima: " + capacidadeMaxima);


        } else {
            System.out.println("Limite exedido");

        }
    }

    public void removerPessoa(int quantidadePessoasSaindo) {
        if (quantidadePessoasSaindo <= 0) {
            System.out.println("Valor invalido");
            return;
        }

        if (pessoasNoElevador - quantidadePessoasSaindo >= 0  ) {
            pessoasNoElevador -= quantidadePessoasSaindo;

            System.out.println("Saiu: " + quantidadePessoasSaindo + " Pessoas");
            System.out.println("Agora tem " + pessoasNoElevador + " pessoas");
            System.out.println("Capacidade maxima: " + capacidadeMaxima);

        } else {
            System.out.println("Valor invalido");

        }
    }

    public boolean subirAndar(int andar) {
        if (andar >= 0 && (andarAtual + andar) < totalAndares) {
            andarAtual += andar;
            System.out.println("Andar: " + andarAtual);
            return true;


        } else {
            System.out.println("Andar invalido");
            return false;


        }
    }

    public boolean descerAndar(int descerAndar) {
        if ((andarAtual - descerAndar) >= 0) {
            andarAtual -= descerAndar;
            System.out.println("Andar: " + andarAtual);
            return true;

        } else {
            System.out.println("Andar invalido");
            return false;


        }
    }
}





