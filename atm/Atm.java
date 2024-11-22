package com.atm;

public class Atm {
	private double balance;
	private double depositeAmount;
	private double withdrawAmunt;
	public Atm() {
		super();
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getDepositeAmount() {
		return depositeAmount;
	}
	public void setDepositeAmount(double depositeAmount) {
		this.depositeAmount = depositeAmount;
	}
	public double getWithdrawAmunt() {
		return withdrawAmunt;
	}
	public void setWithdrawAmunt(double withdrawAmunt) {
		this.withdrawAmunt = withdrawAmunt;
	}

	@Override
	public String toString() {
		return "Atm [balance=" + balance + ", depositeAmount=" + depositeAmount + ", withdrawAmunt=" + withdrawAmunt
				+ "]";
	}
	
	
	

}
