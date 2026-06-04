package week6.abstraction;

public class Main {
    public static void main(String[] args) {
            Account savingAccount =new SavingAccount();
//yesla chai chai account ma vako method haru access garna lauxa. tara real code chai dekhaudina
            SavingAccount savingAccount1=new SavingAccount();
//now savingaccount1 la sab method haru expose garxa...
        savingAccount.accountDetails();

            Account currentacc=new CurrentAccount();
            currentacc.accountDetails();
    }
}
