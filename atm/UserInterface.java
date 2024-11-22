package com.atm;

import java.util.Scanner;

public class UserInterface {
	private static int status;
	public static void main(String[] args) {
		AtmOperationImpl impl=new AtmOperationImpl();
		Scanner sc=new Scanner(System.in);
		int atmnumber=123456;
		int atmpin=123;
		System.out.println("WELCOME TO ATM MACHINE..!");
		System.out.println("ENTER THE ATM NUMBER:");
		int atmnum2=sc.nextInt();
		System.out.println("ENTER THE ATM PIN:");
		int atmpin2=sc.nextInt();
		
		if(atmnumber==atmnum2 && atmpin==atmpin2) {
			while(true) {
			System.out.println(" 1.ViewAvailable Balance\n 2.WithDrawAmount\n 3.DepositAmount\n 4.ViewMiniStatement\n 5.Exit");
			System.out.println("ENTER YOUR CHOICE NUMBER:");
			int ch=sc.nextInt();
			if(ch==1) {
				impl.viewBalance();
			}
			else if(ch==2) {
				System.out.println("ENTER THE AMOUNT TO WITHDRAW:");
				double withdrawamount=sc.nextDouble();
				impl.withdrawAmount(withdrawamount);
			}
			else if(ch==3) {
				System.out.println("ENTER THE AMOUNT TO DEPOSIT:");
				double depositAmount=sc.nextDouble();
				impl.depositAmount(depositAmount);
			}
			else if(ch==4) {
				impl.viewMiniStatement();
			}
			else if(ch==5) {
				System.out.println("COLLECT YOUR ATM CARD \n  THANK YOU....!");
				System.exit(status);
			}
			}
		}
		else {
			System.out.println("INCORRECT ATM NUMBER OR PIN..!");
		}
	}

}
