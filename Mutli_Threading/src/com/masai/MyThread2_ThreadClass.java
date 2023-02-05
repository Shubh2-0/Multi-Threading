package com.masai;

//creating thread using thread class
public class MyThread2_ThreadClass extends Thread{

@Override
public void run() {

	for(int i=10;i>-1;i--) {
		System.out.println(Thread.currentThread().getName()+"   " + i);
	}
	
	
}	


public static void main(String[] args) {

//Total Thread -> 1	
//Executing Thread -> 1 (Main Thread)
MyThread2_ThreadClass t1 = new MyThread2_ThreadClass();
MyThread_Runnable obj = new MyThread_Runnable();
Thread t2 = new Thread(obj);

//Total Thread -> 3
//Executing Thread -> 1 (Main Thread)


t1.start();
t2.start();
//Total Thread -> 3
//Executing Thread -> 2 (Main Thread, t1, t2)
System.out.println(Thread.activeCount());

	
	
}

	
	
}
