package com.company;




//SO THIS IS THE PRODUCER THREAD WHICH PRODUCED THE ITEMS FOR THE COMPANY
public class Producer  extends Thread{

//it have one attribute (PROPERTY)	
	
	Company c;

//CONSTRUCTOR FOR INTANCE VARIABLE THAT IS C 	
public Producer(Company c) {
	this.c=c;
}



@Override
public void run() {
int i = 1;
//here the items is produces
while(true) {	
	
//inside the for the thread internally calling the method that is PRODUCE_ITEM of company object	
c.produce_item(i);

//this thread execution sleep for 3 second 
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	
}


i++;
}	
	
}

}
