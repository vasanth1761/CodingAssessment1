package day2Assessment;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		ABank bankA=new ABank();
		BBank bankB=new BBank();
		CBank bankC=new CBank();
		System.out.println("Enter the bankname A or B or C");
		String option=sc.next();
        switch(option)
        {
        case"A":
        {
        	double amount=bankA.getBalance();
        	System.out.println(amount);
        	break;
        }
        case"B":
        {
        	double amount=bankB.getBalance();
        	System.out.println(amount);
        	break;
        	
        }
        case"C":
        {
        	double amount=bankC.getBalance();
        	System.out.println(amount);
        	break;
        }

	}

	}
}
