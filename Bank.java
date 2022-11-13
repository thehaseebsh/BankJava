package Banking;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String BankName;

    public Bank(String bankName, List<Banking.Customer> customerList, List<Account> accountList) {
        BankName = bankName;
        CustomerList = customerList;
        AccountList = accountList;
    }

    static public List<Customer> CustomerList = new ArrayList<Customer>();
    static public List<Account> AccountList = new ArrayList<Account>();

    public Bank(String BankName)
    {
        this.BankName=BankName;
    }
String Customer;
    static Customer AddCustomer(Person P) {
        Customer CustomerRefrence=new Customer(P);
        CustomerList.add(CustomerRefrence);
        return CustomerRefrence;
    }
     Account AddAccount(float amount, String AccNum,Customer c) {
        Account AccountReference=new Account(amount, AccNum,c);
        AccountList.add(AccountReference);
        return null;
}

Account RemoveCustomer(String CustomerCnic){
        Customer c = SearchCustomerDetail(CustomerCnic);
        CustomerList.remove(c);
        return null;

}
void RemoveAccount(Person p){
        AccountList.remove(p);

}

float TotalAmmount(){
    float sum=0.0f;
    for (Customer C:CustomerList
         )
        sum+=C.TotalAmmount();
        return sum;
    }
    static Customer SearchCustomerDetail(String CustomerCNIC) {
        for (Customer C : CustomerList) {
            if (C.getPersonDetails().PersonCnic == CustomerCNIC) {
                System.out.println("Account Found");
                return C;
            }
        }
        System.out.println("Account Not Found");
        return null;
    }
    Account SearchAccount(String AccountNumber){
        for (Account A:AccountList
             ) {if (A.AccountNumber==AccountNumber){
                 return A;
        }

        }

        return null;

    }


    @Override
    public String toString() {
        return "Bank{" +
                "BankName='" + BankName + '\'' +
                ", CustomerList=" + CustomerList +
                ", AccountList=" + AccountList +
                '}';
    }
}


