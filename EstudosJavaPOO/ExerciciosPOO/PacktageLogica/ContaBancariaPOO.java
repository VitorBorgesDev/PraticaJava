package LogicaJava.PacktageLogica;


public class ContaBancariaPOO {
    // conta 1
    String Titular;
    int NumeroConta;
    double saldo;

    public void exibirDados(){
        System.out.println("titular: " +Titular);
        System.out.println("conta: " +NumeroConta);
        System.out.println("saldo: " +saldo);
    }

     public static void main(String[] args) {
        ContaBancariaPOO conta = new ContaBancariaPOO();

        conta.Titular = "kauany moraes veras";
        conta.NumeroConta = 14432;
        conta.saldo = 0;

        conta.Titular ="vitor gabriel";
        conta.NumeroConta=12341;
        conta.saldo= 1500;

        conta.Titular ="gael henrique";
        conta.NumeroConta=12331231;
        conta.saldo= 1233;



        conta.exibirDados();




    }


}






