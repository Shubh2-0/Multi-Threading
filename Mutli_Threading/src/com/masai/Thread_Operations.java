package com.masai;

/*
 
-> Thread class provide method to perform 
operations with threads;

-> this thread class present in java.lang(ALREADY IMPORTED BY JAVA ITSELF) package.
So we don't need to import the class for thread.

-> Some important methods;

 */

class MyThread extends Thread{

//      0.run()-> contain the task of thread(working that defined byb the user)
public void run() {

	for(int i=0;i<5;i++) {

//		1.currentThread() -> catching the thread that is running 
//      2.getName()	-> return the name of the thread	
		System.out.println(Thread.currentThread().getName());
	}
	
};	
	
}

public class Thread_Operations {

	
	
public static void main(String[] args) {
	
MyThread t1 = new MyThread();

	
	t1.start();
	
}	
	
	
	
	
	
	
}
