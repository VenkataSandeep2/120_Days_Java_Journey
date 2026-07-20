package com;

public class Bank 
{
	public static void main(String[] args) 
	{
		BankAccount bankacc = new BankAccount();
		bankacc.accountnumber = 4585614;
		bankacc.balance = 8543.16;
		
		System.out.println("Bank account number is :-> "+bankacc.accountnumber);
		System.out.println("Account balance is -> "+ bankacc.balance);
	}

}
