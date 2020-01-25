package sample;

public class BankingAccount {
    private int accountNumber;
    private double balance;
    protected int sizeArrays;
    protected Transactions[] transactions = new Transactions[100];
    public BankingAccount(int accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public int getAccNum() {
        return accountNumber;
    }
    public void setAccNum(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public Transactions[] getTransactions() {
        return transactions;
    }
    public void setTransactions(Transactions[] transactions) {
        this.transactions = transactions;
    }
    public void AddTransaction(Transactions transaction){
        transactions[sizeArrays]=transaction;
        sizeArrays++;
        balance+=transaction.getAmount();
    }
}
