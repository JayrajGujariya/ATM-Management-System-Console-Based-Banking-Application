//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package com.ATM;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        AtmOperationInterface op=new AtmOperationImpl();
        int atmnumber=1234;
        int atmpin=123;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Atm Number:");
        int atmNumber=sc.nextInt();
        System.out.print("Enter pin:");
        int pin=sc.nextInt();
        if((atmnumber==atmNumber)&&(atmpin==pin)){
            while (true){
                System.out.println("1.View Vailable Balance \n 2.Withdraw Amount \n 3.Deposit Amount \n 4.View mini Statement \n 5.Exit");
                int ch=sc.nextInt();
                if(ch==1){
                    op.viewBalance();
                }
                else if(ch==2){
                    System.out.println("Enter Withdrawn Amount:");
                    double withdrawnAmt=sc.nextDouble();
                    op.withdrawAmount(withdrawnAmt);
                }
                else if(ch==3){
                    System.out.println("Enter amount to Deposit:");
                    double depositAmt=sc.nextDouble();
                    op.depositAmount(depositAmt);
                }
                else if(ch==4){
                     op.viewMiniStatement();
                }
                else if(ch==5){
                    System.out.println("Please collect your ATM Card\nThank you for using ATM machine");
                    System.exit(0);
                }
                else{
                    System.out.println("Please enter correct choice");
                }
            }
        }
        else{
            System.out.println("Incorrect Atm number or PIN");
            System.out.println("Please try again...");
        }
    }
}