package Week5.constructor;

public class constructor {
    public static void main(String[] args) {
        Account savingAccount=new Account(8989,"ram");
        savingAccount.accountdetail();
        Account currentaccount=new Account(savingAccount);
        currentaccount.accountdetail();
    }
}
