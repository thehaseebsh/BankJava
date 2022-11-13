package Banking;

import java.util.ArrayList;
import java.util.List;

public class Customer {
//    static String CustomerID="C#";
    int CustomerIdNum=0;
    public Person PersonDetails;

    public int getCustomerIdNum() {
        return CustomerIdNum;
    }

    public void setCustomerIdNum(int customerIdNum) {
        CustomerIdNum = customerIdNum;
    }

    public Person getPersonDetails() {
        return PersonDetails;
    }

    public void setPersonDetails(Person personDetails) {
        PersonDetails = personDetails;
    }

    private List<Account> AccountList = new ArrayList<Account>();

// Constructor Created

    Customer(Person Details){
        PersonDetails=Details;
        CustomerIdNum=CustomerIdNum+1;
    }
float TotalAmmount(){
    float sum=0;
    for (Account A:AccountList) {
        System.out.println(A);
        sum += A.AccountAmmount;
    }
    return sum;
}
    void WithdrawAmmount(float Ammount,String AccountID){
        for (Account A :AccountList
             ) {if(A.AccountNumber==AccountID){
                 A.withdraw(Ammount);
        }

        }

    }
    void DepositAmmount(float Ammount,String AccountID){
        for (Account A :AccountList) {
            if(A.AccountNumber==AccountID) {
                A.deposit(Ammount);
            }
        }
    }
    void AddAccount (float ammount, String AccNum) {
        Account A=new Account(ammount, AccNum,this);
        AccountList.add(A);

        }


    @Override
    public String toString() {
        return "Customer{" +
                "CustomerID='" + "C#"+CustomerIdNum + '\'' +
                ", PersonDetails=" + PersonDetails +
                '}';
    }
}