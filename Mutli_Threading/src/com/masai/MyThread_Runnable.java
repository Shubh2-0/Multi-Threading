package com.masai;

// creating thread using runnable interface
public class MyThread_Runnable implements Runnable{

@Override
public void run() {

for(int i=0;i<10;i++) {
	System.out.println(Thread.currentThread().getName()+"   "+i);
//	try {
//		Thread.sleep(2000); //here we are performing sleep operation on that thread is running at this point 
//	} catch (Exception e) {
//		// TODO: handle exception
//	}
}
	
}	
	

public static void main(String[] args) {
	
MyThread_Runnable obj = new  MyThread_Runnable();

/* We can not directly run(use of start method) the normal class which implements Runnable interface as a Thread because
Runnable interface have only one abstract method that is 
run 
t1.start(); */

/* here we pass our reference to the thread 
thread class now that thread is responsible 
for running the thread we created using runnable
interface */
Thread t1	= new Thread(obj);
/* Here we have two Thread -> 1.Main Thread 2.Thread that we created and at this point we have only one executing 
 thread that is main thread 
 */
//System.out.println(Thread.activeCount());
t1.start();

/* Here we have two Thread -> 1.Main Thread 2.Thread that we created and at this point we have Two executing 
 thread that is main thread and thread that we have created 
 */
//System.out.println(Thread.activeCount());




	
}




}

