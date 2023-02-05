package com.company;

public class Main {

	
public static void main(String[] args) {

Company c = new Company();	
	
Producer p1 = new Producer(c);
Consumer c1 = new Consumer(c);
p1.start();
c1.start();
	
	
	
	
}	
	
	

}
