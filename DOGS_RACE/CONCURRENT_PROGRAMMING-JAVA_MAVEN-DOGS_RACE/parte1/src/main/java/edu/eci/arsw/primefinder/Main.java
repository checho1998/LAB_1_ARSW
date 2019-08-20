package edu.eci.arsw.primefinder;


import java.io.*;

public class Main {

	public static void main(String[] args) {
		
		PrimeFinderThread hilo1 = new PrimeFinderThread(0,10000000);
		PrimeFinderThread hilo2 = new PrimeFinderThread(10000000,20000000);
		PrimeFinderThread hilo3 = new PrimeFinderThread(20000000,30000000);
		hilo1.start();
		hilo2.start();
		hilo3.start();
		
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader leer = new BufferedReader(r);
		int time = 5000;
		new java.util.Timer().schedule( 
		        new java.util.TimerTask() {
		        	@Override
		            public void run() {
		                try {
		                	hilo1.suspend();
		                	hilo2.suspend();
		                	hilo3.suspend();
							while(leer.read() == '\n') {
								leer.read();
							}
							hilo1.resume();
							hilo2.resume();
							hilo3.resume();
						} catch (IOException e) {
							e.printStackTrace();
						}
		                }
		        },time);
				
		
		
		//PrimeFinderThread pft=new PrimeFinderThread(0, 30000000);
		//pft.start();
		
		
		
	}
	
}
