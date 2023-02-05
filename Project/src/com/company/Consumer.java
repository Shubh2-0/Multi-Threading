package com.company;

public class Consumer extends Thread{
	
Company c;

public Consumer(Company c) {
	this.c = c;
}

@Override
	public void run() {
	
	while(true) {
	
		c.comsume_item();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}
		
	}
	
	}


	

}
