package sample;

public class Transactions {
    int transactionNumber;
    String date;
    double amount;
    public Transactions(int transactionNumber,String date,double amount){
        this.transactionNumber=transactionNumber;
        this.date=date;
        this.amount=amount;
    }
    public int getTransactionNumber() {
        return transactionNumber;
    }
    public void setTransactionNumber(int transactionNumber) {
        this.transactionNumber = transactionNumber;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
}
