package com.masai;

public class GooglePay extends Thread{

Bank b;
int amount=0;


public GooglePay(Bank b) {
	this.b = b;
}
public void setamount(int amount) {
	this.amount = amount;
}

@Override
	public void run() {
	
	b.Withdrawal(amount);
	
	
	
	}




	

}
