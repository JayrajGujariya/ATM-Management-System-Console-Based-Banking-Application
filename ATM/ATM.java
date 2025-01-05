package com.ATM;
public class ATM {
      private double balance;
      private double depositAmount;
      private double withdrawnAmount;
      //deafault constructor
      public ATM(){

      }
      // getter and setter

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getWithdrawnAmount() {
        return withdrawnAmount;
    }

    public void setWithdrawnAmount(double withdrawnAmount) {
        this.withdrawnAmount = withdrawnAmount;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }
}
