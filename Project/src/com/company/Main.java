package com.company;


//THIS IS OUR COMPANY (REAL ENTITY)
public class Main {

//EXECUTION OF THE COMOPANY WORK	
public static void main(String[] args) {

	
//CREATING A COMPANY	
Company c = new Company();	

//CREATING TWO THREADS FOR WORKING SIMULTANEOUSLY

Producer p1 = new Producer(c); // FOR PRODUCING THE ITEM 
Consumer c1 = new Consumer(c);// FOR COMSUMING THE ITEM

//EXECUTION IS STARTING AT THIS POINTX
p1.start();
c1.start();
	

/* SO HERE THEY WORKING SIMULTANEOUSLY IF THE ITEM IS PROCED SO NEXT THRAED WILL ALWAYS BE CONSUMER THREAD 
IF THE ITEM IS NOT PRODUCE SO FIRST THEY PRODUCE THE ITEM THAN CONSUME ALSO WE CAN GIVE ANY NUMBER OF SECOND WAIT*/
	
	
}	
	
	

}
