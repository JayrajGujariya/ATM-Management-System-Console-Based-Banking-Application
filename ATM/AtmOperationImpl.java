package com.ATM;

import java.util.HashMap;
import java.util.Map;

public class AtmOperationImpl implements AtmOperationInterface {
    ATM atm=new ATM();
    Map<Double,String>miniStatement=new HashMap<>();
    @Override
    public void viewBalance() {
        System.out.println("Available balance is:"+atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if(atm.getBalance()>=withdrawAmount){
            miniStatement.put(withdrawAmount,"Amount Withdrawn..");
            System.out.println(" Withdrawn successfully !!");
            System.out.println("Collect your Cash:"+withdrawAmount);
            atm.setBalance(atm.getBalance()-withdrawAmount );
            viewBalance();
        }
        else{
            System.out.println("Insufficient balance!");
            System.out.println("Please check your Available balance");
        }
    }

    @Override
    public void depositAmount(double depositAmount) {
        miniStatement.put(depositAmount,"Amount deposited..");
        System.out.println(depositAmount+" Deposited successfully !!");
        atm.setBalance(atm.getBalance()+depositAmount);
        viewBalance();
    }


    @Override
    public void viewMiniStatement() {
        miniStatement.forEach((key,value)->{
            System.out.println(key+" "+value);
        });
    }
}
