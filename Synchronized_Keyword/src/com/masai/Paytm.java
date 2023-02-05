package com.masai;

public class Paytm extends Thread {
	
Bank b ;
int amount=0;

public Paytm(Bank b) {
	this.b = b;
}
public void setamount(int amount) {
	this.amount = amount;
}

@Override
synchronized public void run() {
	
	b.Withdrawal(amount);
	
	
	
	
	}


	
	

}
