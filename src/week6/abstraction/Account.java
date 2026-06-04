package week6.abstraction;

//building a abstract class
//In this class we write some protocal or logic to be more precise, which restricts the other class to implement certain some
//fecture of abstract class

public abstract class Account {
//    abstract Method
//    there must be one abstract method in abstract class
    public abstract void accountDetails();

//    concrete Method
     public void checkBalance(){
     }

}


////python implementation
//from abc import ABC, abstractmethod
//
//# Building an abstract class
//# This class defines a protocol that other classes must follow
//
//class Account(ABC):
//
//        # Abstract method
//    # Any subclass must implement this method
//@abstractmethod
//def account_details(self):
//pass
//
//    # Concrete method
//def check_balance(self):
//print("Checking balance...")