package com.company;

public class Company {
int n;
boolean f = false;
	
synchronized public void produice_item(int n) {
	
	if(f) {
		try {
			wait();
		} catch (Exception e) {
			
		}
	}

	this.n = n;
	System.out.println("Produced :"+this.n);
	f=true;
	notify();
	
}
	

synchronized public int comsume_item() {
	
	if(!f) {
	 
	try {
		wait();
	} catch (Exception e) {
		
	}	
		
	}
	
	System.out.println("Consumed :"+this.n);
	f=false;
	notify();
	return this.n;
	
}

	
}
