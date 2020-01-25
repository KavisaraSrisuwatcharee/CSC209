package sample;

public class CheckingAccount extends BankingAccount {
    private double overDraft;
    public CheckingAccount(int accountNumber,double balance){
        super(accountNumber,balance);
    }
    public double getOverDraft() {
        return overDraft;
    }
    public void setOverDraft(int overDraft) {
        this.overDraft = overDraft;
    }
    public void AddTransaction(Transactions transaction){
        double balance=super.getBalance();
        double amount=transaction.getAmount();
        if(amount>0){
            // deposit
//            if(overDraft==0){
//                balance+=amount;
//            }else{
//                overDraft-=amount;
//                if (overDraft>amount){
//
//                }
//            }
            if(overDraft==0){
                super.setBalance(balance+amount);
            } else if(overDraft>0){
                if(overDraft>amount) {
                    overDraft -= amount;
                }else if(overDraft==amount){
                    overDraft=0;
                }else{
                    super.setBalance(amount-overDraft);
                    overDraft=0;
                }
            }
        }else{
            // withdraw
            if(balance>0){
                if(balance>amount*-1){
                    super.setBalance(balance+amount);
                }else if(balance==amount*-1){
                    super.setBalance(0);
                }else{
                    overDraft+=(amount*-1)-balance;
                    super.setBalance(0);
                }
            }else if(balance==0){
                overDraft+=amount*-1;
            }

        }
        transactions[sizeArrays]=transaction;
        sizeArrays++;
    }
}
