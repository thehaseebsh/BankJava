package Banking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver {
    private static List<Person> persons = new ArrayList<Person>();

    private static Person searchPerson(String ID) {
        for (Person p : persons) {
            if (p.getPersonCnic().compareTo(ID) == 0)
                return p;
        }
        return null;
    }

    private static void loadPeople() {

    }

    public static void main(String args[]) {


        Bank bank = new Bank("MyBank");

//        Person p1 = new Person("Hina Khalid", "2345-5-6", "03004511752");
//        Person p2 = new Person("Asim Rehmat", "2344345-4-6", "03045432323");
//        persons.add(p1);
//        persons.add(p2);
//        Customer c = bank.AddCustomer(p1);
//        System.out.println(c);
//        System.out.println("________________After Addiing Customer 1________________");
//        c.AddAccount(40, "AC0");
//        c.AddAccount(34, "AC1");
//        c.DepositAmmount(300, "AC0");
//        System.out.println(c+"\n Total Balance="+c.TotalAmmount());
//        System.out.println(bank);
//        Customer d = new Customer(p2);
//        bank.AddCustomer(p2);
//        System.out.println("________________After Addiing Customer 2________________");
//        System.out.println(bank);
//        System.out.println(bank.TotalAmmount());
//        System.out.println("________________After Removing Customer 1________________");
//        bank.RemoveCustomer(1);
//        System.out.println(bank);
        int choice=0;
        while (choice==0) {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter The Following \n C- Adding Customers \n A- Adding Accounts \n W- Withdrawing Money \n D- Deposit Money  \n I- Customer Info \n B- Bank Info \n X- Account Detail \n F- Exit");
            switch (myObj.next()) {
                case "C":
                {
                    System.out.println("Enter Name ");
                    String Name = myObj.next();
                    System.out.println("Enter CNIC ");
                    String CNIC = myObj.next();
                    System.out.println("Enter Phone Number ");
                    String PhoneNumber = myObj.next();
                    Person P = new Person(Name, CNIC, PhoneNumber);
                    Bank.AddCustomer(P);
                    System.out.println(bank);
                    break;
                }
                case "A":
                {
                    System.out.println("Enter CNIC OF Customer");
                    String CustomerCnic=myObj.next();
                    Customer C=bank.SearchCustomerDetail(CustomerCnic);//Giving Null Value
                    System.out.println(C);
                    System.out.println("Enter Initial Ammount");
                    float InitialAmmount= myObj.nextFloat();
                    bank.AddAccount(InitialAmmount,C.getPersonDetails().PersonCnic,C);
                    System.out.println(Bank.AccountList);
                }
                case "W":
                {
                    System.out.println("Enter CNIC");
                    String CustomerCnic=myObj.next();
                    Account A=bank.SearchAccount(CustomerCnic);
                    System.out.println("Enter Ammount To Be Withdrawn");
                    float WithdrawAmmount=myObj.nextFloat();
                    A.withdraw(WithdrawAmmount);
                    break;
                }

                case "D":
                {
                    System.out.println("Enter CNIC");
                    String CustomerCnic=myObj.next();
                    Account A=bank.SearchAccount(CustomerCnic);
                    System.out.println("Enter Ammount To Be Deposited");
                    float DepositedAmmount=myObj.nextFloat();
                    A.deposit(DepositedAmmount);
                    System.out.println("Ammount Succssfully Deposited");
                    break;
                }
                case "I":
                {
                    System.out.println("Enter CNIC");
                    String CustomerCnic=myObj.next();
                    Customer C=bank.SearchCustomerDetail(CustomerCnic);
                    System.out.println(C);
                    break;
                }

                case "B":
                {
                    System.out.println(bank);
                    break;
                }
                case "X":
                {
                    System.out.println("Enter CNIC");
                    String CustomerCnic = myObj.next();
                    Account A=bank.SearchAccount(CustomerCnic);
                    System.out.println(A);
                }

                case "F":
                {
                    choice=1;
                    break;
                }
                default:
                {
                    break;
                }


            }
        }
    }
}