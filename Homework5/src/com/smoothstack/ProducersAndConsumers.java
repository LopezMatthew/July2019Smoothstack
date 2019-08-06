package com.smoothstack;


public class ProducersAndConsumers {

	public static void main(String args[]) {
		producer P1 = new producer();
	    consumer C1 = new consumer();
		P1.start();
		C1.start();
		
	}
public static volatile int silo = 0;
	
private static class producer extends Thread {
    public void run() {
       synchronized (this) {
          System.out.println("Producer is now growing corn...");
          for(int i = 0; i < 10; i++) {
        	  int produced = (int)(Math.random()* 100);
        	  silo = silo + produced;
        	  System.out.println("The producer has produced "+ produced 
        	  +" pounds of corn. It has been added to the silo. There are now "+ silo
        	  +" pounds of corn in the silo");
        	  
          }
          
       }
    }
 }

private static class consumer extends Thread{
	public void run() {
		synchronized(this) {
			System.out.println("The monster is now consuming corn...");
			 for(int i = 0; i < 10; i++) {
	        	  int consumed = (int)(Math.random()* 100);
	        	  silo = silo - consumed;
	        	  System.out.println("The monster has consumed "+ consumed 
	        	  +" pounds of corn from the silo. There are now "+ silo
	        	  +" pounds of corn in the silo");
	        	  
	          }
		}
	}
}
}