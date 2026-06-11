package LogicaJava.PacktageLogica;
import java.sql.SQLOutput;
import java.util.Scanner;

// Peça ano de nascimento
//Calcule idade (2024 - anoNasc)
//Valide:
//Idade 0-150? OK
//<0 ou >150? "Idade inválida!"
//Mostre faixa etária:
//0-12: CRIANÇA
//13-17: ADOLESCENTE
//18-59: ADULTO
//60+: IDOSO

public class LogicaDeProgramaçaoIdade {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu ano de nascimento: ");
        int AnoNascimento = sc.nextInt();
        int idade = 2026 - AnoNascimento;

        if ( idade <0 || idade > 150){
            System.out.println("INVALIDO");

        } else if(idade < 12){
            System.out.println("\uD83D\uDC76 criança");

        } else if(idade < 17){
            System.out.println("\uD83E\uDDD2 ADOLESCENTE");

        } else if(idade < 60){
            System.out.println("\uD83E\uDDD1 ADULTO");

        }  else {
            System.out.println("\uD83D\uDC74 IDOSO");
        }



        sc.close();







    }
}





