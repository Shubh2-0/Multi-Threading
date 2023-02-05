package com.masai;



public class Bank {
	
private int balance;
String bankName;
String customerName;



public Bank(int balance, String bankName, String customerName) {
	this.balance = balance;
	this.bankName = bankName;
	this.customerName = customerName;
}

public int getBalance() {
	return balance;
}

public void setBalance(int balance) {
	this.balance = balance;
}


synchronized public void Withdrawal(int amount) {
if(balance < amount) System.out.println("BALANCE IS LESS");
else if(balance >= amount) {
	System.out.println("SUCCESSFULLY WITHDRAW :" + amount );
	int b = getBalance() - amount;
	this.setBalance(b);
	System.out.println("REMAINING BALANCE :" + this.getBalance());
}else {
	System.out.println("AMOUNT SHOULD BE MORE THAN 0");
}

	
	
}


}
