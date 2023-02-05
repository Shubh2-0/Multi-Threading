package com.masai;

/*
 
-> Thread class provide method to perform 
operations with threads;

-> this thread class present in java.lang(ALREADY IMPORTED BY JAVA ITSELF) package.
So we don't need to import the class for thread.

-> Some important methods;

 */

class MyThread extends Thread{

//      0.run()-> contain the task of thread(working that defined by the user)
public void run() {

	for(int i=0;i<20;i++) {

//		1.currentThread() -> catching the thread that is running 
//      2.getName()	-> return the name of the thread	
		System.out.println(Thread.currentThread().getName());
		
		
        
/*	    3.sleep() -> sleep the thread(NON-WORKING STATE) for given second in argument
	      argument in millisecond and also this method throw a Exception called
	      InterruptedException which is a kind of checked Exception so we 
	      have to write in try-catch block */
	        		
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
};	
	
}

public class Thread_Operations {
        
	
	
public static void main(String[] args) {
	
MyThread t1 = new MyThread();
//          4.setName() -> setting the name of the thread 
      t1.setName("My-Thread");
      
      
//          5.getName() -> return the name of the thread        
String name = t1.getName();  


/*          6.setPriority() -> setting the priority of the Thread
            MAX = 10 , MIN = 1 , NORMAL = 5 (DEFAULT) */
t1.setPriority(9);


//          7.getPriority() -> return the priority of the thread 
int priority = t1.getPriority();

   




         
///*(We can use here also)->> sleep() -> sleep the thread(NON-WORKING STATE) for given second in argument
//	        argument in millisecond and also this method throw a Exception called
//	        InterruptedException which is a kind of checked Exception so we 
//	        have to write in try-catch block */
//	        
//	
//	try {
//		t1.sleep(2000);
//	} catch (InterruptedException e) {
//		// TODO: handle exception
//	}
//	
	t1.start();
	
	
	
/*	       8.join() -> ending the thread before another thread throw also InterruptedException which is a kind of checked Exception so we 
           have to write in try-catch block */ 
	try {
		t1.join();
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	
	
	//THIS TASK IS PERFORMING BY MAIN THREAD (DEFAULT THREAD)      
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	
	
	
	
	
}	
	
	
	
	
	
	
}
