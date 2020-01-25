package sample;

public class SavingAccount extends BankingAccount {
    private double interestRate;
    public SavingAccount(int accountNumber, double balance, double interestRate){
        super(accountNumber,balance);
        this.interestRate=interestRate;
    }
    public double getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }
    public void EndYear(){
        double accInterest = super.getBalance();
        accInterest+= (accInterest*interestRate)/100;
        super.setBalance(accInterest);
    }
}
