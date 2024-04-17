package com.abtraction;
interface CreditCard{
    void payOnline();
}
abstract class HDFCCreditCard implements CreditCard{
    abstract void withdrawMoney();
    public void payOnline(){
        System.out.println("online transaction enabled");
    }
}

class Platinum extends HDFCCreditCard{
    @Override
    void withdrawMoney() {
        System.out.println("Withdraw from US bank");
    }
}
class Rupay extends HDFCCreditCard{
    @Override
    void withdrawMoney() {
        System.out.println("Withdraw from Indian ATM");
    }
}
public class AbstractImplInterfaceExp {
    public static void main(String []args){
        CreditCard creditCard = new Platinum();
        creditCard.payOnline();

        HDFCCreditCard hdfcPlatinum = new Platinum();
        hdfcPlatinum.payOnline();
        hdfcPlatinum.withdrawMoney();

        HDFCCreditCard rupay = new Rupay();
        rupay.payOnline();
        rupay.withdrawMoney();

    }
}
