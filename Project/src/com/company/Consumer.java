package com.company;



//SO THIS IS THE CONSUMER THREAD WHICH CONSUMED THE ITEMS
public class Consumer extends Thread{


//it have one attribute (PROPERTY)		
Company c;

//CONSTRUCTOR FOR INTANCE VARIABLE THAT IS C 	
public Consumer(Company c) {
	this.c = c;
}


@Override
	public void run() {
	
	while(true) {

		
//		inside the for the thread internally calling the method that is COMSUME_ITEM of company object		
		c.comsume_item();
		
//		this thread execution sleep for 1 second 
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			
		}
		
	}
	
	}


	

}
