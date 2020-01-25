package sample;

public class Controller {
    public static void main(String[] args) {
        SavingAccount save= new SavingAccount(1001, 15000.00, 0.20);
        CheckingAccount check = new CheckingAccount(2001, 1000.00);
        Transactions trans1 = new Transactions(1, "20/01/2020", 2000.00);
        Transactions trans2 = new Transactions(1, "21/01/2020", -2000.00);
        Transactions trans3 = new Transactions(2, "22/01/2020", 1500.00);
        Transactions trans4 = new Transactions(2, "23/01/2020", 2000.00);
        Transactions trans5 = new Transactions(2, "24/01/2020", -3000.00);

        System.out.println("--------------------------");
        System.out.println("----- Saving Account -----");
        System.out.println("--------------------------");
        save.AddTransaction(trans1);
        System.out.printf("S1 Get Balance: %.2f\n", save.getBalance());
        save.EndYear();
        System.out.printf("S1 Get Balance: %.2f\n", save.getBalance());
        save.AddTransaction(trans2);
        save.EndYear();
        System.out.printf("S1 Get Balance: %.2f\n", save.getBalance());
        save.EndYear();
        save.EndYear();
        System.out.printf("S1 Get Balance: %.2f\n", save.getBalance());

        System.out.println();
        System.out.println("--------------------------");
        System.out.println("---- Checking Account ----");
        System.out.println("--------------------------");
        System.out.println("Get Balance: " + check.getBalance() + " , Get Overdraft Mount: " + check.getOverDraft());
        check.AddTransaction(trans2);
        System.out.println("Get Balance: " + check.getBalance() + " , Get Overdraft Mount: " + check.getOverDraft());
        check.AddTransaction(trans3);
        System.out.println("Get Balance: " + check.getBalance() + " , Get Overdraft Mount: " + check.getOverDraft());
        check.AddTransaction(trans4);
        System.out.println("Get Balance: " + check.getBalance() + " , Get Overdraft Mount: " + check.getOverDraft());
        check.AddTransaction(trans5);
        System.out.println("Get Balance: " + check.getBalance() + " , Get Overdraft Mount: " + check.getOverDraft());
    }
}
