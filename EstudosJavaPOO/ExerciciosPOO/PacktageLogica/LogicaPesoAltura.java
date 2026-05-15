package LogicaJava.PacktageLogica;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.lang.Thread;
import java.util.Locale;

public class LogicaPesoAltura {
    public static void main(String[] args) throws InterruptedException {
        // Locale (US) and import java.lang.Thread;
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite a sua Altura(m): ");
        double altura = sc.nextDouble();
        System.out.println("Agora digite o seu Peso(kg):");
        double peso = sc.nextDouble();

        System.out.println(" Sua Altura(m) : " +  altura + "\nseu Peso(kg) :  " +  peso + "\n");
        System.out.println("Calculando Seu IMC...");
        Thread.sleep(2500);


        System.out.println("\n--- RESULTADO ---");


        double IMC = peso / (altura * altura);

        if (IMC < 18.5 ) {
            System.out.println(" \uD83D\uDCC9 Abaixo");

        }  else if (IMC > 18.5 && IMC < 24.9) {
            System.out.println(" ✅ Normal");

        } else if (IMC >= 25 && IMC < 29.9) {
            System.out.println(" \uFE0F Sobre Peso");

        } else if (IMC > 30) {
            System.out.println("\uD83D\uDEA8 Obeso");

        }


        // altura : ...
        // peso : ...
         // calculando ...


        // seu resultado
        // imc calculado
    sc.close();
    }

}
