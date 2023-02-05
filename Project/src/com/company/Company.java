package com.company;
/* Create a class name called 
COMPANY which have to method 
first one is PRODUCE ITEM which produce the item for company and
second one is COMSUME ITEM which consume the item which produced by produce item method */
public class Company {
	
//here i declare a variable n which denoted the number of items that are produced by the produce item method
int n;

//here is the boolean variable for item communication threading
boolean f = false;

/* here i used synchronized keyword which ensure that the thread that are currently working completed after 
completion of their task they are able to enter to execute . synchronized keyword void the race condition between Threads */
//THIS METHOD BASICALLY PRODUCED THE ITEMS FOR THE COMPANY
synchronized public void produce_item(int n) {
	
//	here i declare a condition if the f is true so the execution of this method thread have to wait 
	if(f) {
		try {
			wait();
		} catch (Exception e) {
			
		}
	}
    
//	so here the execution is working means the value of f is false
	
//	assign the value of n via constructor
	this.n = n;
	
//	printing the value
	System.out.println("Produced :"+this.n);
	
//	here this thread now performed their task so i assign the value of f as true
	f=true;
	
//	and resume the pause for another thread execution
	notify();
	
}
	


/* here i used synchronized keyword which ensure that the thread that are currently working completed after 
completion of their task they are able to enter to execute . synchronized keyword void the race condition between Threads */
//THIS METHOD BASICALLY CONSUMED THE COMPANY ITEMS 
synchronized public int comsume_item() {
	
	
/*here i declare a condition that if the f is not true that means false
so the thread which have this method have to wait until the f value is true */
	
	if(!f) {
	 
	try {
		wait();
	} catch (Exception e) {
		
	}	
		
	}
	
//	here printing the value of n  
	System.out.println("Consumed :"+this.n);
	
//	assign value of f as false 
	f=false;
	
//	resume the waiting thread
	notify();
	
//	return the value of n
	return this.n;
	
}

	
}
