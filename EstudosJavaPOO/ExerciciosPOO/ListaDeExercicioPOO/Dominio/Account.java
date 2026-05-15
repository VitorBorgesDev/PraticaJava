package LogicaJava.ListaDeExercicioPOO.Dominio;

public class Account {
    public String accountNumber;
    public double balance;

    public Account(String accountNumber, double balance) {
        if (accountNumber == null || accountNumber.isEmpty() ) {
            System.err.println("Error: Account number cannot be null or empty.");
            return;

        }
            if (balance < 0) {
                System.out.println("Error: Balance cannot be negative.");
                return;

            }

            this.accountNumber = accountNumber;
            this.balance = balance;
        }
    }








