package com.company;

public class Producer  extends Thread{

	Company c;

public Producer(Company c) {
	this.c=c;
}


@Override
public void run() {
int i =1;
while(true) {	
c.produice_item(i);

try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	
}


i++;
}	
	
}

}
