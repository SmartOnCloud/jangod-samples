package org.jangod.samples.helloworld;

public class Sample {
    
    public static void main(String[] args) throws InterruptedException {
	System.out.println("started");
	
	while (true) {
	    System.out.println("....step");
	    Thread.sleep(2000);
	}
    }

}
