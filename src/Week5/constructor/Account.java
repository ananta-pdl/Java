package Week5.constructor;

public class Account {
    String accHolderName;
    double balance;
    String accountType;

////    non parametrized constructor
//    Account(){
//        System.out.println("account constructor");
////        this is a keyword that sets a value when the object is made
//        this.balance=500;
//    }
//parameterized constructor
    Account(double balance,String accHolderName){
        this.balance=balance;
        this.accHolderName=accHolderName;
    }
//copy constructor
    Account(Account account){
        this.balance=account.balance;
        this.accHolderName=account.accHolderName;
    }

    public void accountdetail(){
        System.out.println("Name"+accHolderName);
        System.out.println("balance"+balance);
        System.out.println("account type"+accountType);
    }
}


