package com.masai;

/*

 -> Daemon thread in java is a service provider thread that 
    provide services to the user thread
  
 -> setDaemon(Boolean)
 
 -> public Boolean isDaemon()
 
 -> GARBAGE COLLECTOR is best example of Daemon thread
 
 
 
 */

class thread1 extends Thread{

	public void run() {
	
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
	
}


class thread2 extends Thread{
	
	public void run() {
		System.out.println("THIS IS A DAEMON THREAD");
	};
}


public class Daemon_Thread {
	
public static void main(String[] args) {
	
thread1 t1 = new thread1();
thread2 t2 = new thread2();
//t2.start();
t2.setDaemon(true);

t1.start();try {
	t1.join();
} catch (Exception e) {
	// TODO: handle exception
}
System.out.println(t1.isDaemon());
System.out.println(t2.isDaemon());
	
}	

}
