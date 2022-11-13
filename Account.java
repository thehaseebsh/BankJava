package Banking;

public class Account {
    String AccountNumber;
    float AccountAmmount;
    Customer AccountHolder;

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public float getAccountAmmount() {
        return AccountAmmount;
    }

    public void setAccountAmmount(float accountAmmount) {
        AccountAmmount = accountAmmount;
    }

    public Customer getAccountHolder() {
        return AccountHolder;
    }

    public void setAccountHolder(Customer accountHolder) {
        AccountHolder = accountHolder;
    }

    // Constructor Created
    Account(float Ammount, String AccountNumber,Customer C){
        this.AccountAmmount=Ammount;
        this.AccountHolder=C;
        this.AccountNumber=AccountNumber;
    }

    float withdraw(float Ammount){
        float withdrawn=this.AccountAmmount-Ammount;
        AccountAmmount = withdrawn;
        return withdrawn;
    }
    float deposit(float Ammount) {
        float deposited = this.AccountAmmount + Ammount;
        AccountAmmount = deposited;
        return deposited;
    }

    @Override
    public String toString() {
        return "Account{" +
                "Account Number =" + AccountNumber +
                ",Account Ammount=" + AccountAmmount +
                ",Account Holder=" + AccountHolder +
                '}';
    }
}
