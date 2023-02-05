package com.masai;

public class Main {

public static void main(String[] args) {
	
	
Bank myBank = new Bank(5000, "Bank Of India", "Karan");

Paytm paytm = new Paytm(myBank);
GooglePay gpay = new GooglePay(myBank);


paytm.setamount(400);
gpay.setamount(3000);

paytm.start();
gpay.start();
	
	
	
	
	
	
}	
	
	
	
	
}
