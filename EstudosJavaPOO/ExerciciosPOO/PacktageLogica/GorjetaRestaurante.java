package LogicaJava.PacktageLogica;

import javax.xml.parsers.SAXParser;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.lang.Thread;


public class GorjetaRestaurante {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int saldo = 200;

        System.out.println("🥤 BEM VINDO AO RESTAURANTE DO SEU JOSE!!!");
        System.out.println("💰 SALDO ATUAL: R$" + saldo);
        System.out.println("ESCOLHA O QUE VAI COMER!!!");

        // MENU
        System.out.println("\n🍬 MENU:");
        System.out.println("1 - Carne ao Molho ..... R$30");
        System.out.println("2 - Carne de Sol ....... R$40");
        System.out.println("3 - Baiao .............. R$35");
        System.out.println("4 - Churrasquinho p/2 .. R$75");
        System.out.print("→ Sua escolha: ");

        int escolha = sc.nextInt();
        System.out.println("✅ Você escolheu: " + escolha);


        double[] precos = {0, 30, 40, 35, 75};
        double valorPrato = precos[escolha];

        switch(escolha) {
            case 1:
                System.out.println("🔥 CARNE AO MOLHO sendo PREPARADA...");
                Thread.sleep(3000);
                System.out.println("🍖 PRONTO!");
                break;
            case 2:
                System.out.println("🔥 CARNE DE SOL sendo PREPARADA...");
                Thread.sleep(1850);
                System.out.println("☀️ PRONTO!");
                break;
            case 3:
                System.out.println("🔥 BAIAO sendo PREPARADO...");
                Thread.sleep(2300);
                System.out.println("🍚 PRONTO!");
                break;
            case 4:
                System.out.println("🔥 CHURRASQUINHO PARA 2 sendo PREPARADO...");
                Thread.sleep(2500);
                System.out.println("🍖 PRONTO!");
                break;
            default:
                System.out.println("❌ Prato inválido!");
                sc.close();
                return;
        }

        System.out.println("\n📋 NOTA FISCAL:");
        System.out.println("Prato: R$" + String.format("%.2f", valorPrato));
        System.out.println("----------------");

        // forma de pagamento

        System.out.println("\n💳 FORMA DE PAGAMENTO:");
        System.out.println("1 - Pix");
        System.out.println("2 - Cartão Débito");
        System.out.println("3 - Cartão Crédito");
        System.out.print("→ ");
        int pagamento = sc.nextInt();

        switch(pagamento) {
            case 1: System.out.println("✅ Pix recebido!"); break;
            case 2: System.out.println("💳 Débito aprovado!"); break;
            case 3: System.out.println("💳 Crédito aprovado!"); break;
            default: System.out.println("❌ Pix automático!"); break;
        }


        System.out.println("\n💰 Deseja pagar GORJETA?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        System.out.print("→ ");
        int gorjetaEscolha = sc.nextInt();

        double gorjeta = 0;
        if(gorjetaEscolha == 1) {
            System.out.print("💵 Qual valor da gorjeta? R$");
            gorjeta = sc.nextDouble();

            if(gorjeta < 0 || (valorPrato + gorjeta) > saldo) {
                System.out.println("❌ Gorjeta inválida!");
                gorjeta = 0;
            }
        }


        double totalConta = valorPrato + gorjeta;
        saldo -= (int)totalConta;

        // Forma Final
        System.out.println("\n✅ PAGAMENTO CONCLUÍDO!");
        System.out.println("📋 RESUMO:");
        System.out.println("Prato:     R$" + String.format("%.2f", valorPrato));
        if(gorjeta > 0) {
            System.out.println("Gorjeta:   R$" + String.format("%.2f", gorjeta));
        }
        System.out.println("TOTAL:     R$" + String.format("%.2f", totalConta));
        System.out.println("💰 Saldo final: R$" + saldo);

        sc.close();
    }
}
