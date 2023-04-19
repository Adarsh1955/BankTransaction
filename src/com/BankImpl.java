package com;

public class BankImpl implements Bank
{
	private int balance;

	BankImpl(int balance)
	{
		this.balance=balance;
	}
	@Override
	public void deposit(int amount)
	{
		System.out.println("Depositing Rs."+amount);
		balance=balance+amount; //balance += amount;
		System.out.println("amount deposited successfully");
	}

	@Override
	public void withdraw(int amount)
	{
		if(amount<=balance)
		{
			System.out.println("withdrawing Rs."+amount);
			balance = balance - amount; //balance -= amount;
			System.out.println("amount withdrawn successfully");
		}
		else
		{
			System.out.println("insufficient balance!");
		}

	}

	@Override
	public int checkBalance()
	{
		return balance;
	}

}
